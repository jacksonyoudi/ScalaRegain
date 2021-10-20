package com.youdi.ch09.implicitd


/**
 * 1. 隐式函数名称无所谓， 只与签名有关， 注意不能签名冲突
 *
 */
object D01 {
  def main(args: Array[String]): Unit = {
    // 编写一个隐式函数
    // 在作用域中才有效
    implicit def f1(d: Double): Int = {
      d.toInt
    }

    val num: Int = 3.5 // 底层编译 f1$1(3.5)
    println(num)
  }
}
