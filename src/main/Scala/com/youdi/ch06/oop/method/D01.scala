package com.youdi.ch06.oop.method

/**
 * scala中方法其实就是函数，声明规则和函数式编程中函数声明一样
 *
 */

object D01 {
  def main(args: Array[String]): Unit = {
    val dog: Dog = new Dog
    dog.say
  }

}


class Dog {
  def say(): Unit = {
    println("wangwang")
  }
}