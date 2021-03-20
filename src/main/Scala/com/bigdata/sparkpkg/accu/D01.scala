package com.bigdata.sparkpkg.accu

import org.apache.spark.rdd.RDD
import org.apache.spark.util.LongAccumulator
import org.apache.spark.{SparkConf, SparkContext}

object D01 {
  def main(args: Array[String]): Unit = {
    val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("")
    val sc: SparkContext = new SparkContext(conf)
    val mkRDD: RDD[Int] = sc.makeRDD(List(1, 2, 3, 4))
    //
    //    val i: Int = mkRDD.reduce(_ + _)
    //    print(i)

    // 错误示范
    //    var sum: Int = 0
    //    mkRDD.foreach(
    //      num => sum = num + sum
    //    )
    //
    //    print(sum)


    //


//    sc.doubleAccumulator("ss")
//    sc.collectionAccumulator("tt")
    val sum: LongAccumulator = sc.longAccumulator("sum")

    mkRDD.foreach(sum.add(_))

    print(sum.value)



    sc.stop()

  }

}
