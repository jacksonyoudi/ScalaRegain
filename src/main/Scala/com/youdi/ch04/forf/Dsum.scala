package com.youdi.ch04.forf

object Dsum {

  def main(args: Array[String]): Unit = {
    val start: Int = 1
    val end: Int = 100
    var sum: Int = 0
    for (i <- start to end if i % 9 == 0) {
      sum += i
    }

    println(sum)
  }
}
