package com.youdi.ch14


/**
 * 高阶函数可以返回函数类型
 *
 */
object HighOrderFunctionD02 {
  def main(args: Array[String]): Unit = {

    // 返回匿名函数
    // 返回的匿名函数可以使用变量接收
    def minus(x: Int): Int => Int = {
      (y: Int) => x - y // 匿名函数
    }

    val result: Int = minus(3)(5)
    println(result)


  }

}
