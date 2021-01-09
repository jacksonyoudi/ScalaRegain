package com.youdi.ch06.oop


/**
 * val | var 对象名[:类型] = new 类型()
 * 1. 如果我们不希望改变对象的引用(内存地址)，应该声明为val性质，否则声明为var,一般都是修改属性，很少修改对象地址的
 * 2. 可以自动推断，单当类型和后面new有继承关系即为多态时，必须写
 *
 *
 * 类和对象的内存分配机制
 */
object OOP2 {
  def main(args: Array[String]): Unit = {
    val emp = new Emp

    val p: Person1 = new Emp

  }
}

class Person1 {}

class Emp extends Person1 {}
