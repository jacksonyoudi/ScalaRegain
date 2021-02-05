package com.youdi.ch14


/**
 * 高阶函数： 能够接收函数作为参数 的函数， 叫做高阶函数 (highorder function)
 * 可使用应用程序更加健壮
 *
 * 可以传多个 函数当做参数
 */
object HigherOrderFunction {
  def main(args: Array[String]): Unit = {
    def test(f: Double => Double, n1: Double): Double = {
      f(n1)
    }



    def sum(f: Double): Double = {
      f + f
    }

    val d: Double = test(sum, 6.0)
    println(d)


  }

}
