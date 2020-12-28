package com.youdi.ch04.forf

object D03 {
  def main(args: Array[String]): Unit = {


    for (i <- 0 to 10 if i % 2 == 0) {
      println("hello " + i)
    }
  }
}
