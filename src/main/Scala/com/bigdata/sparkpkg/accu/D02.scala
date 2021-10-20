package com.bigdata.sparkpkg.accu

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object D02 {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("wc")
    val sc: SparkContext = new SparkContext(conf)
    val mkRDD: RDD[String] = sc.makeRDD(List("hello", "spark", "hello", "scala"))

    val acc: MyAccumulator = new MyAccumulator
    sc.register(acc, "wcAcc")
    mkRDD.foreach(acc.add(_))
    print(acc.value)

    sc.stop()

  }

}
