package com.youdi.ch04.ifelse


/**
 * cmd + B 跳转到对应的包中  使用光标也可以的
 *
 * 不论if else多复杂， 每种条件只能有一个
 */

import scala.io._

object D01 {
  def main(args: Array[String]): Unit = {
    println("input")
    val he: String = StdIn.readLine()

    val i: Int = 10
    if (i > 10) {
      println("big")
    } else {
      println("small")
    }

//  }
}
