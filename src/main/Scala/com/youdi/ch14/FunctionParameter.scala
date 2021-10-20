package com.youdi.ch14


/**
 * 函数也是有类型的, 类型是根据参数确定的
 *
 */
object FunctionParameter {
  def main(args: Array[String]): Unit = {
    def plus(x: Int) = 3 + x

    println(plus _)
  }

}
