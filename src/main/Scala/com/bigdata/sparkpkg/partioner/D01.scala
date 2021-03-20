package com.bigdata.sparkpkg.partioner

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.rdd.RDD

object D01 {
  def main(args: Array[String]): Unit = {
    val sparkconf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("persist")
    val sc: SparkContext = new SparkContext(sparkconf)
    val txtRDD: RDD[String] = sc.textFile("oen.txt")
    val mapRDD: RDD[(String, Int)] = txtRDD
      .flatMap(_.split(" "))
      .map((_, 1))

    val parRDD: RDD[(String, Int)] = mapRDD
      .partitionBy(new MyPartitioner)


    // 将数据内存持久化
    parRDD
      .groupByKey()
      .collect()
      .foreach(print)
  }

}
