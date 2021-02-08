package com.bigdata.sparkpkg.ch05.rddpkg.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object D11 {
  def main(args: Array[String]): Unit = {
    val sparkconf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc: SparkContext = new SparkContext(sparkconf)

    // glom
    val rdd: RDD[Int] = sc.makeRDD(List(1, 2, 3, 4), 2)
    // 每一个数据会返回一个key

    def groupByFuction(num: Int): Int = {
      num % 2
    }


    val groupRDD: RDD[(Int, Iterable[Int])] = rdd.groupBy(groupByFuction)
    groupRDD.collect().foreach(println)

    sc.stop()
  }

}
