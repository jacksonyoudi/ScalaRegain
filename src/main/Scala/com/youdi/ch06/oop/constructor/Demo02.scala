package com.youdi.ch06.oop.constructor

object Demo02 {
  def main(args: Array[String]): Unit = {
    val a = new A("hello")
//    println()
  }
}

/**
 * 顺序 辅助构造器 -> 父类 主构造器 -> 子类 辅助构造器器
 *
 */
class B {
  println("B")
}

class A extends B {
  println("c")
  def this(name: String) {
    this // 调用主构造器,为了实现子类和父类的联系的关联
    println("A")
  }
}
