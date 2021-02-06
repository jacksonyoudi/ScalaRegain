package com.youdi.ch14


object CustomUntil {
  def main(args: Array[String]): Unit = {
    var x: Int = 10
    while (x > 0) {
      x -= 1
      println(x)
    }

    x = 10
    until(x > 0) {
      x -= 1
      println(x)
    }


    def until(condition: => Boolean)(block: => Unit): Unit = {
      if (condition) {
        block
        until(condition)(block)
      }
    }


  }
}
