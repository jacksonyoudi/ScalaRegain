package com.bigdata.sparkpkg.ch06

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object T10 {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("T10")
    val sc: SparkContext = new SparkContext(conf)

    //  1. 读取数据
    val lines: RDD[String] = sc.textFile("user_click.txt")
//    lines.map(_.split(" ")
//      .filter(_ (6) != "-1")
//      .map()
    sc.stop()
  }
}
