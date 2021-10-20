package com.youdi.ch06.oop.inheritance

/**
 * scala明确规定，重写一个非抽象方法需要使用 override修饰符，调用超类的方法使用super关键字
 */
object D02 {
  def main(args: Array[String]): Unit = {
    val b: B = new B
    b.say
  }
}


class A {
  def say(): Unit = {
    println("Hello")
  }
}

class B extends A {
  override def say(): Unit = {
    println("xixi")
    super.say()

  }
}