package com.youdi.ch14


/**
 * 函数柯里化
 * 1. 函数编程中， 接收多个参数的函数都可以改成转化为接收单个参数的函数， 这个转化过程就是柯里化
 * 2. 柯里化就是证明函数只需要一个参数而已
 * 3. 不用设立颗粒换
 */
object CurryD {
  def main(args: Array[String]): Unit = {
    def mul(x: Int, y: Int): Int = x * y

    def mulCurry(x: Int) = (y: Int) => x * y

    def mulCurry2(x: Int)(y: Int) = x * y

    println(mul(3, 4))
    println(mulCurry(3)(4))
    println(mulCurry2(3)(4))


  }

}
