package com.bigdata.sparkpkg.partioner

import org.apache.spark.Partitioner

// 自定义分区器
class MyPartitioner extends Partitioner {

  // 分区数量
  override def numPartitions: Int = {
    3
  }

  override def getPartition(key: Any): Int = {
    key match {
      case "nba" => 0
      case "cba" => 1
      case _ => 2
    }
  }
}
