package com.bigdata.sparkpkg.ch05.rddpkg.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

/**
 * glom分区不变
 */

object D09 {
  def main(args: Array[String]): Unit = {
    val sparkconf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc: SparkContext = new SparkContext(sparkconf)

    // glom
    val rdd: RDD[Int] = sc.makeRDD(List(1, 2, 3, 4), 2)
    val mapRDD: RDD[Int] = rdd.map(_ * 2)
    // 分区数据不变
    mapRDD.saveAsTextFile("output")


    sc.stop()
  }

}
