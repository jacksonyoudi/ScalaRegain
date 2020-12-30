package com.youdi.ch05.mlazy


/**
 * lazy不能修饰var类型的变量
 * 不但在调用函数时，加了lazy，会导致函数的执行被推迟，我们在声明一个变量时，如果给声明了lazy，那么变量值也会被分配延迟。
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
