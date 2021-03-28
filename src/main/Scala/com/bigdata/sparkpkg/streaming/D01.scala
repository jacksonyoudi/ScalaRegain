package com.bigdata.sparkpkg.streaming

import org.apache.spark.SparkConf
import org.apache.spark.streaming.dstream.{DStream, ReceiverInputDStream}
import org.apache.spark.streaming.{Seconds, StreamingContext}


object D01 {
  def main(args: Array[String]): Unit = {
    // 环境配置 +
    val sparkConf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("streaming")
    val ssc: StreamingContext = new StreamingContext(sparkConf, Seconds(3))

    // 获取端口数据
    val lines: ReceiverInputDStream[String] = ssc.socketTextStream("localhost", 9876)
    val words: DStream[String] = lines.flatMap(_.split(" "))
    val wordsMap: DStream[(String, Int)] = words.map((_, 1))
    val ds: DStream[(String, Int)] = wordsMap.reduceByKey(_ + _)
    ds.print()


    // 1. 启动采集器
    // 2. 等待采集器结束

    ssc.start()
    ssc.awaitTermination()
  }

}
