package com.youdi.ch10.collectpkg

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object AB {
  def main(args: Array[String]): Unit = {

    val value: ArrayBuffer[Any] = ArrayBuffer[Any](3, 2, 1)
    println(value(1))

    for (i <- value) {
      println(i)
    }

    println(value.hashCode())

    // 追加数据 java数组的扩容
    value.append(10, 10)
    println(value.hashCode())

    value(1) = 90
    println(value.hashCode())

    // 根据下标 删除
    value.remove(0)
    //


    // 定长和动态转换
    val array: Array[Any] = value.toArray
    val buffer: mutable.Buffer[Any] = array.toBuffer

  }
}
