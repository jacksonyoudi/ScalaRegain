package com.bigdata.sparkpkg.ch05.rddpkg.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object D02 {
  def main(args: Array[String]): Unit = {
    val sparkconf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    sparkconf.set("park.default.parallelism", "5")
    val sc: SparkContext = new SparkContext(sparkconf)

    // 创建RDD
    val ints: Seq[Int] = Seq(1, 2, 3, 4, 5, 6)
    val rdd: RDD[Int] = sc.makeRDD(ints)

    val maprdd: RDD[Int] = rdd.mapPartitionsWithIndex((
      (index, iterator) => {
        if (index == 2) {
          iterator
        } else {
          Nil.iterator // 空集合
        }
      }
      ))

    rdd.map()

    maprdd.collect().foreach(println)

    sc.stop()
  }

}
