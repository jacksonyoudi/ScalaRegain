package com.youdi.ch04.ifelse

import scala.io.StdIn

object D02 {
  def main(args: Array[String]): Unit = {

    println("input a")
    val a: Int = StdIn.readInt()

    println("input b")
    val b: Int = StdIn.readInt()

    println("input c")
    val c: Int = StdIn.readInt()



    if ((b * b - 4 * a * c) > 0) {
        println("big")
    } else {
      println("small")
    }
  }
}
