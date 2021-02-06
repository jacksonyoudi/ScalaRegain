package com.bigdata.sparkpkg.ch01

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

/**
 *
 * Application
 * spark框架
 * 建立和Spark框架的连接
 * 执行业务操作
 * 关闭连接
 */

object WordCount {
  def main(args: Array[String]): Unit = {

    val sparkconf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("WordCount")
    val sc: SparkContext = new SparkContext(sparkconf)

    // 读取文件

    val lines: RDD[String] = sc.textFile("/Users/youdi/project/javaproject/ScalaRegain/data")
    val words: RDD[String] = lines.flatMap(_.split(" "))
    val wordGroup: RDD[(String, Iterable[String])] = words.groupBy(word => word)

    val wc: RDD[(String, Int)] = wordGroup.map {
      case (word, list) => {
        (word, list.size)
      }
    }

    wc.collect().foreach(println)


    sc.stop()


  }

}
