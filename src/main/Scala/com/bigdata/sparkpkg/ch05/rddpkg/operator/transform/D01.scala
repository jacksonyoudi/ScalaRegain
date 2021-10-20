package com.bigdata.sparkpkg.ch05.rddpkg.operator.transform

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.rdd.RDD

object D01 {
  def main(args: Array[String]): Unit = {
    val sparkconf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    sparkconf.set("park.default.parallelism", "5")
    val sc: SparkContext = new SparkContext(sparkconf)

    // 创建RDD
    val ints: Seq[Int] = Seq(1, 2, 3, 4, 5, 6)
    val rdd: RDD[Int] = sc.makeRDD(ints)

    //
    def mapFunction(num: Int): Int = {
      num * 2
    }


    rdd.map(mapFunction).collect().foreach(println)

    rdd.map((num: Int) => {
      num * 2
    })

    rdd.map(_ * 2)


    sc.stop()
  }

}
