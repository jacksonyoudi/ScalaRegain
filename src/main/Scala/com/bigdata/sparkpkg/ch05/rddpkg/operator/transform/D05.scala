package com.bigdata.sparkpkg.ch05.rddpkg.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object D05 {
  def main(args: Array[String]): Unit = {
    val sparkconf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc: SparkContext = new SparkContext(sparkconf)

    val rdd: RDD[String] = sc.makeRDD(List("Hello word", "Hello spark"))
    rdd.flatMap(_.split(" ")).collect().foreach(println)

    sc.stop()
  }

}
