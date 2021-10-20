package com.bigdata.sparkpkg.ch05.rddpkg.operator.action

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}


object WC {
  def main(args: Array[String]): Unit = {
    val sparkconf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("persist")
    val sc: SparkContext = new SparkContext(sparkconf)
    val txtRDD: RDD[String] = sc.textFile("oen.txt")
    val mapRDD: RDD[(String, Int)] = txtRDD
      .flatMap(_.split(" "))
      .map((_, 1))

    // 设置检查点的路径
    sc.setCheckpointDir("dir")

    mapRDD.checkpoint()

    // 将数据内存持久化
    mapRDD.cache()
      .groupByKey()
      .collect()
      .foreach(print)
  }
}
