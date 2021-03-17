package com.bigdata.sparkpkg.ch05.rddpkg.operator.transform

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.rdd.RDD

object Ad {
  def main(args: Array[String]): Unit = {
    val sparkconf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("Ad")
    val sc: SparkContext = new SparkContext(sparkconf)

    val textFile: RDD[String] = sc.textFile("")
    val reduceRDD: RDD[((String, String), Int)] = textFile.map(
      line => {
        var words = line.split(" ")
        ((words(0), words(1)), 1)
      }
    ).reduceByKey(_ + _)


    val mewMapRDD: RDD[(String, (String, Int))] = reduceRDD.map {
      case ((prv, ad), sum) => {
        (prv, (ad, sum))
      }
    }

    mewMapRDD.groupByKey().mapValues(
      iter => {
        iter.toList.sortBy(_._2)(Ordering.Int.reverse).take(3)
      }
    ).collect().foreach(println)


    sc.stop()
  }

}
