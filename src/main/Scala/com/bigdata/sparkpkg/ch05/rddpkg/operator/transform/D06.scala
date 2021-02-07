package com.bigdata.sparkpkg.ch05.rddpkg.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object D06 {
  def main(args: Array[String]): Unit = {
    val sparkconf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc: SparkContext = new SparkContext(sparkconf)

    val rdd: RDD[Any] = sc.makeRDD(List(List(1, 2), 3, List(5, 6)))
    //    val value: RDD[Any] = rdd.flatMap(
    //      data => {
    //        data match {
    //          case b: List[_] => b
    //          case data => List(data)
    //        }
    //      }
    //    )

    val value: RDD[Any] = rdd.flatMap(_ match {
      case a: List[_] => a
      case b => List(b)
    })


    value.collect().foreach(println)


    sc.stop()
  }

}
