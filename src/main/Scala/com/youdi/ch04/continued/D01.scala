package com.youdi.ch04.continued

import scala.util.control.Breaks.{break, breakable}


/**
 * continue
 * 1. 使用循环守卫, 直接跳过
 */
object D01 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10 if (i != 2 && i != 3)) {
      println("i=" + i)
    }

    for (i <- 1 to 10) {

      if (i != 2 && i != 3) {
        println("i=" + i)
      }
    }

    breakable {
      for (i <- 1 to 100) {
        if (i == 20) {
          break()
        }
      }
    }

  }
}
