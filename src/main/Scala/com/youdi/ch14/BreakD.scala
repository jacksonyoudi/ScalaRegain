package com.youdi.ch14

import scala.util.control.Breaks.{break, breakable}


/**
 * 控制抽象
 *
 * 从形式上看， 是将一段代码，作为参数传递给高阶函数， 在高阶函数内部执行这段代码
 */
object BreakD {
  def main(args: Array[String]): Unit = {

    var n: Int = 0


    breakable {
      while (n < 10) {
        n += 1
        if (n == 5) {
          break()
        }
      }
    }

  }

}
