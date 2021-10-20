package com.bigdata.sparkpkg.broadcast

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

import scala.collection.mutable

object D01 {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("broadcast")
    val sc: SparkContext = new SparkContext(conf)


    val rdd1: RDD[(String, Int)] = sc.makeRDD(List(
      ("a", 1),
      ("b", 2),
      ("c", 3)))

    val rdd2: RDD[(String, Int)] = sc.makeRDD(List(
      ("a", 1),
      ("b", 2),
      ("d", 3)))

    val map1: mutable.Map[String, Int] = mutable.Map[String, Int](
      ("a", 2),
      ("b", 3),
      ("d", 4)
    )


    rdd1.map {

      case (key, value) => {
        val i: Int = map1.getOrElse(key, 0)
        (key, (value, 1))
      }
    }.collect().foreach(print)


    // 数据量会几何增长， 会影响shuffle的性能，不推荐使用
    //val joinRDD: RDD[(String, (Int, Int))] = rdd1.join(rdd2)
    //joinRDD.collect().foreach(print)


    sc.stop()


  }

}
