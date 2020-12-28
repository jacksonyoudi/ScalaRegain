package com.youdi.ch04.pwhile

object DoWhile {
  def main(args: Array[String]): Unit = {
    var i: Int = 0

    do {
      println(i)
      i += 1
    } while (i < 10)
  }
}
