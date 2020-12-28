package com.youdi.ch04.forf

/**
 * for引入变量
 */
object D04 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10; j = i + 1) {
      println("hello " + i + "," + j)
    }
  }
}
