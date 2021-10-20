package com.youdi.ch14

/**
 * 闭包： 是一个函数和其相关的引用环境组合的一个整体(实体)
 *
 * 函数 + 对象属性 method + attribute
 *
 * 函数引用了函数外的哪些变量， 他们一起组合成一个整体(实体)， 形成一个闭包。
 *
 */

object ClosureD {
  def main(args: Array[String]): Unit = {
    def minus(x: Int) = (y: Int) => x - y

    val f = minus(20) // 函数是闭包

  }
}
