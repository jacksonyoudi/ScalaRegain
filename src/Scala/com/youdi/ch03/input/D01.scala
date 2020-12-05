package com.youdi.ch03.input

import scala.io.StdIn

object D01 {
  def main(args: Array[String]): Unit = {
    println("输入:")
    val name: String = StdIn.readLine()
    println("name", name)
    val s: Double = StdIn.readDouble()
    println("s", s)
    Cat.sayHello()
  }
}

// 声明一个对象 伴生对象

object Cat extends AAA


// 特质等价于 java中的interface 和 abstract class
trait AAA {
  def sayHello(): Unit = {
    println("hello")
  }
}