package com.youdi.ch04.pwhile

import util.control.Breaks._


object BreakD {
  def main(args: Array[String]): Unit = {
    var n = 10

    /**
     * breakable是一个高阶函数
     * 高阶函数： 可以接收函数的函数
     * def breakable(op: => Unit): Unit =  接收一个没有参数和返回值的函数， 就是一个代码块
     *
     * 捕获异常
     * def breakable(op: => Unit): Unit =
     * try op catch { case ex: BreakControl if ex eq breakException => }
     *
     *
     * 4. 当我们传入的是代码块， scala程序员会将() -> {}
     */
    breakable {
      while (n <= 20) {
        n += 1
        println(n)
        if (n == 12) {
          // 使用breakable进行中断
          // def break(): Nothing = throw breakException 抛出异常
          break()
        }
      }
    }
    println("ok")
  }

}
