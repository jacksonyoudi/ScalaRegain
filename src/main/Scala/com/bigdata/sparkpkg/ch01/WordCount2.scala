package com.bigdata.sparkpkg.ch01

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.rdd.RDD

object WordCount2 {
  def main(args: Array[String]): Unit = {
    val sparkconf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("WordCount")
    val sc: SparkContext = new SparkContext(sparkconf)

    // 读取文件

    val lines: RDD[String] = sc.textFile("/Users/youdi/project/javaproject/ScalaRegain/data")
    val words: RDD[String] = lines.flatMap(_.split(" "))
    //    words.map((_, 1)).groupBy(t => t._1).map {
    //      case (word, list) => {
    //        list.reduce(
    //          (t1, t2) => {
    //            (t1._1
    //              , t1._2 + t2._2)
    //          }
    //        )
    //      }
    //    }

    val wc: RDD[(String, Int)] = words.map((_, 1)).reduceByKey(_ + _)
    wc.collect().foreach(println)

    sc.stop()


  }
}
