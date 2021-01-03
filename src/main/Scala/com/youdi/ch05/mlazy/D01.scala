package com.youdi.ch05.mlazy


/**
 * lazy不能修饰var类型的变量，是线程安全的
 * 不但在调用函数时，加了lazy，会导致函数的执行被推迟，我们在声明一个变量时，如果给声明了lazy，那么变量值也会被分配延迟。
 * val a Int lazy = 10
 *
 * 惰性计算： 尽可能延迟表达式求值，是许多函数式编程语言的特性，惰性集合在需要时提供其元素，无需预先计算他们，这带来了一些好处
 * 首先，你可以将耗时的计算推迟到绝对需要的时候，其次，
 *
 *
 * java的单例模式
 *
 */
object D01 {
  def main(args: Array[String]): Unit = {
    lazy val res = sum(1, 2)
    println("------------")
    println(res)
  }

  def sum(n1: Int, n2: Int): Int = {
    println("sum")
    n1 + n2
  }
}
