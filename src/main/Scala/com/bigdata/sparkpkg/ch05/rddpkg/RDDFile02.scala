package com.bigdata.sparkpkg.ch05.rddpkg

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}


/**
 * spark读取文件，底层其实使用的就是hadoop的读取方式
 * 1. spark读取文件，采用hadoop方式读取，所以一行一行读取， 和字节数没有关系
 * 2. 数据读取时，是以偏移量为单位的，偏移量不会重复读取
 * 3. 数据分区的偏移量的范围计算
 * 4.如果数据源为多个文件，读取是以文件为单位的
 *
 */
object RDDFile02 {
  def main(args: Array[String]): Unit = {
    val sparkconf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc: SparkContext = new SparkContext(sparkconf)

    // textFile也可以设置分区
    // minPartitions: Int = defaultMinPartitions
    // math.min(defaultParallelism, 2)
    //
    val rdd: RDD[String] = sc.textFile("/Users/youdi/project/javaproject/ScalaRegain/data")
    sc.stop()

  }

}
