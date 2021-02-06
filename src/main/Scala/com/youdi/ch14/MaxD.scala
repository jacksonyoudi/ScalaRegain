package com.youdi.ch14

/**
 * 递归是告诉计算机做什么， 不是告诉它怎么做
 */
object MaxD {
  def main(args: Array[String]): Unit = {
    val l: List[Int] = List(1, 7, 10, 100, 0, 8, 99)
    println(max1(l))

  }

  def max1(list: List[Int]): Int = {
    if (list.isEmpty) {
      return -1
    }
    if (list.size == 1) {
      return list.head
    }

    if (list.head > max1(list.tail)) {
      list.head
    } else {
      max1(list.tail)
    }

  }
}
