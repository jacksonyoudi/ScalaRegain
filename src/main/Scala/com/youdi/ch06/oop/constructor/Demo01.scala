package com.youdi.ch06.oop.constructor

/**
 * 主构造器
 * 辅构造器 可以多个 this
 * 编译器通过不同参数进行区分
 *
 *
 * scala构造器作用是完成对新对象初始化，构造器是没有返回值的
 * 主构造器的声明直接放置于类名之后
 * 主构造器会执行类定义中所有语句 除去  method的
 * 如果主构造器无参数，小括号可以省略
 * 辅助构造器是使用this， 辅助构造器必须第一行调用 this
 */
object Demo01 {
  def main(args: Array[String]): Unit = {
    val p: Person = new Person("jack", 10)
    println(p)
  }
}


class Person(inName: String, inAge: Int) {
  println(1000)
  println(1000)
  var name: String = inName
  var age: Int = inAge
  println(900)

  override def toString: String = {
    name + " " + age
  }

  def this(inName: String) {
    this(inName, 20)
    this.age = 100
  }
}