package com.bigdata.sparkpkg.ch05.rddpkg

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}


object CreateRDDMemory {
  def main(args: Array[String]): Unit = {
    val sparkconf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    sparkconf.set("park.default.parallelism", "5")
    val sc: SparkContext = new SparkContext(sparkconf)

    // 创建RDD
    val ints: Seq[Int] = Seq(1, 2, 3, 4, 5, 6)
    // parallelize 并行
    //    scheduler.conf.getInt("spark.default.parallelism", totalCores)
    //    val rdd: RDD[Int] = sc.parallelize(ints)

    //   分区和并行度
    val rdd: RDD[Int] = sc.makeRDD(ints, 1)


    val value: RDD[Int] = rdd.repartition(2)

    // parallelize(seq, numSlices)

    value.saveAsTextFile("output")


    rdd.collect().foreach(println)


    sc.stop()
  }

}
