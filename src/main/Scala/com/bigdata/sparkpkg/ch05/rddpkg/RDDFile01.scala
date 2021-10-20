package com.bigdata.sparkpkg.ch05.rddpkg

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object RDDFile01 {
  def main(args: Array[String]): Unit = {
    val sparkconf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc: SparkContext = new SparkContext(sparkconf)

    // path可以相对路径也可以是 绝对路径
    // 也可以是分布式文件系统路径
    // 读取数据是元祖 (path, content)
    val rdd: RDD[(String, String)] = sc.wholeTextFiles("/Users/youdi/project/javaproject/ScalaRegain/data")
    rdd.foreach(println)

    sc.stop()

  }

}
