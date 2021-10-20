package com.bigdata.sparkpkg.ch05.rddpkg.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object D04 {
  def main(args: Array[String]): Unit = {
    val sparkconf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc: SparkContext = new SparkContext(sparkconf)

    val rdd: RDD[List[Int]] = sc.makeRDD(List(List(1, 2), List(3, 4), List(5, 6)))
    val flatRDD: RDD[Int] = rdd.flatMap(list => list)
    flatRDD.collect().foreach(println)

    sc.stop()
  }

}
