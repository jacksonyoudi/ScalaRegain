package com.youdi.ch02.datatype

/**
 * Unit等价于java中的void, 只有一个实例值 ()
 *
 * Null类只有一个实例对象，null， 类似于java中的null引用，null可以赋值给任意引用类型anyref
 * 但是不能赋值给anyval
 *
 * Nothing 是 botton class, 是所有类的子类， 用于异常，表示不是正常返回值
 */

object UnitNullNothingDemo {
  def main(args: Array[String]): Unit = {
    val unit: Unit = sayHello()
    println(unit)

    val dog: Dog = null

    // an expression of type Null is ineligible for implicit conversion
//    val c1: Char = null
//    print(c1)
  }

  def sayHello(): Unit = {}
}


class Dog {

}