package com.youdi.ch06.interfaced


/**
 * 1. 当trait中只有抽象方法时，底层和interface一样的
 * 2. 当trait中有抽象方法和普通方法是，生成Trait03$.class抽象类 和 Trait03 接口
 *
 */
object D03 {
  def main(args: Array[String]): Unit = {
    val sheep: Sheep = new Sheep
    sheep.sayHi()
    sheep.sayHello()

  }
}

trait Trait03 {
  // 抽象方法
  def sayHi()

  // 普通方法
  def sayHello(): Unit = {
    println("Hello")
  }
}



// 底层对应 class Sheep implements Trait03
// 当在sheep类中调用Trait03的实现方法，就是通过  Trait03$.class 调用
class Sheep extends Trait03 {
  override def sayHi(): Unit = {
    println("sheep say Hello")
  }
}
