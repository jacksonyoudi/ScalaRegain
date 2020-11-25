package com.youdi.ch02.vars

object VarDemo02 {
  def main(args: Array[String]): Unit = {
    // 类型推导
    var num = 10

    println(num.isInstanceOf[Int])
    num = 1
  }
}
