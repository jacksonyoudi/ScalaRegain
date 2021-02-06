package com.bigdata.sparkpkg.ch05.rddpkg

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}


object CreateRDDMemory {
  def main(args: Array[String]): Unit = {
    val sparkconf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc: SparkContext = new SparkContext(sparkconf)

    // 创建RDD
    val ints: Seq[Int] = Seq(1, 2, 3, 4, 5, 6)
    // parallelize 并行
    //    val rdd: RDD[Int] = sc.parallelize(ints)
    val rdd: RDD[Int] = sc.makeRDD(ints)
    // parallelize(seq, numSlices)


    rdd.collect().foreach(println)


    sc.stop()
  }

}
