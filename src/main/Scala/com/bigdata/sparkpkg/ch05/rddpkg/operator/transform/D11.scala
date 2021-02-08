package com.bigdata.sparkpkg.ch05.rddpkg.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object D11 {
  def main(args: Array[String]): Unit = {
    val sparkconf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc: SparkContext = new SparkContext(sparkconf)

    val rdd: RDD[String] = sc.makeRDD(List("Spark", "Scala", "Hadoop", "Hive"), 2)


    // 注意， 分组和分区没有必然的关系  groupBy 会将数据打乱， 就是shuffle的过程
    val groupRDD: RDD[(Char, Iterable[String])] = rdd.groupBy(_.charAt(0))
    groupRDD.collect().foreach(println)

    sc.stop()
  }

}
