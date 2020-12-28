package com.youdi.ch04.forf

object D01 {
  def main(args: Array[String]): Unit = {
    val start: Int = 1
    val end: Int = 10


    /**
     * start
     *
     */
    for (i <- start to end) {
      println("hello" + i)
    }


    // 可以对集合直接进行遍历
    val list = List("hello", 10, 30, 40)
    for (elem <- list) {
      println("hello " + elem)
    }
  }
}
