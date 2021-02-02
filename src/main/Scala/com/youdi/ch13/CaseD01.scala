package com.youdi.ch13


/**
 * 1. 样例类仍然是类
 * 2. 样例类用case关键字进行声明
 * 3. 样例类是为了模式匹配而优化的类
 * 4. 构造器中的每一个参数都成为val--除非它被显式声明为 var(不建议这样做)
 * 5. 在样例类对应的伴生对象中提供apply方法让你不用new关键字就能构造出对应的对象
 * 6. 提供unapply方法让模式匹配可以工作
 * 7. 将自动生成tostring, equals, hashCode和copy方法(有点类似模板类，直接给生成，供程序员使用)
 * 8. 除上述外， 样例类和其他类完全一样，你可以添加方法和字段，扩展它们。
 */

object CaseD01 {
  def main(args: Array[String]): Unit = {
      println("hello")
  }
}


abstract class Amount

case class Dollar(value: Double) extends Amount

case class Currency(value: Double, unit: String) extends Amount

case object NoAmount extends Amount