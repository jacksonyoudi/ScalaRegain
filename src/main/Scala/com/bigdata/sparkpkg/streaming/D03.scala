package com.bigdata.sparkpkg.streaming

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}
import org.apache.spark.streaming.dstream.{DStream, ReceiverInputDStream}

object D03 {
  def main(args: Array[String]): Unit = {
    // 环境配置 +
    val sparkConf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("streaming windowßß")
    val ssc: StreamingContext = new StreamingContext(sparkConf, Seconds(3))

    // 使用有状态的，必须要有检查点的目录
    ssc.checkpoint("cp")

    // 获取端口数据
    val lines: ReceiverInputDStream[String] = ssc.socketTextStream("localhost", 9876)
    val words: DStream[String] = lines.flatMap(_.split(" "))
    val wordsMap: DStream[(String, Int)] = words.map((_, 1))

    // 滑动
    val wDs: DStream[(String, Int)] = wordsMap.window(Seconds(6), Seconds(6))
    val ds: DStream[(String, Int)] = wDs.reduceByKey(_ + _)


    ds.print()


    // 1. 启动采集器
    // 2. 等待采集器结束


    ssc.start()

    new Thread(
      new Runnable {
        override def run(): Unit = {
          // 第三方，用于判断是否关闭
          ssc.stop(true, true)
          System.exit(0);
        }
      }
    ).start()

    ssc.awaitTermination()

  }

}
