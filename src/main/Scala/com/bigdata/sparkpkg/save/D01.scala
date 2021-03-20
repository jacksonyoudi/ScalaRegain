package com.bigdata.sparkpkg.save

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object D01 {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("save")
    val sc: SparkContext = new SparkContext()
    val mkRDD: RDD[(String, Int)] = sc.makeRDD(List(
      ("a", 1),
      ("b", 2),
      ("c", 3),
      ("d", 4)
    ))

    mkRDD.saveAsTextFile("")
    mkRDD.saveAsObjectFile("")
    mkRDD.saveAsSequenceFile("")

    sc.objectFile("")
//    sc.sequenceFile("", 1)

    sc.stop()
  }

}
