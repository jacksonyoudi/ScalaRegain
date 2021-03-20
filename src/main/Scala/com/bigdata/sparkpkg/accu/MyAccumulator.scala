package com.bigdata.sparkpkg.accu

import org.apache.spark.util.AccumulatorV2

import scala.collection.mutable

/**
 * 自定义累加器
 * 创建累加器对象
 * 向spark注册，使用累加器
 *
 * 继承AccumulatorV2类型
 *
 */
class MyAccumulator extends AccumulatorV2[String, mutable.Map[String, Long]] {
  private var wcMap: mutable.Map[String, Long] = mutable.Map[String, Long]()

  // 判断是否初始状态
  override def isZero: Boolean = {
    wcMap.isEmpty
  }

  //
  override def copy(): AccumulatorV2[String, mutable.Map[String, Long]] = {
    new MyAccumulator

  }

  override def reset(): Unit = {
    wcMap.clear()
  }

  // 输入
  override def add(v: String): Unit = {
    val l: Long = wcMap.getOrElse(v, 0L) + 1
    wcMap.update(v, l)
  }

  // 合并累加器， 在driver端执行的
  override def merge(other: AccumulatorV2[String, mutable.Map[String, Long]]): Unit = {
    val map1: mutable.Map[String, Long] = this.wcMap
    val map2: mutable.Map[String, Long] = other.value


    map2.foreach {
      case (w, c) => {
        val l: Long = map1.getOrElse(w, 0L) + c
        map1.update(w, l)
      }

    }
    this.wcMap = map1

  }

  override def value: mutable.Map[String, Long] = {
    wcMap
  }
}
