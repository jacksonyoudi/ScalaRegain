package com.youdi.ch04.forf

object D02 {
  def main(args: Array[String]): Unit = {
    val start: Int = 1
    val end: Int = 11
    for (i <- start until end) {
      println("hello " + i)
    }
  }
}
