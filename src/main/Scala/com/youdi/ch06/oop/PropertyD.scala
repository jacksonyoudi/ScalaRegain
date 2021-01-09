package com.youdi.ch06.oop

object PropertyD {
  def main(args: Array[String]): Unit = {
    val p1 = new Person()
    println(p1.name)
    println(p1.address)
    println(p1.p)
    println(p1.b)
  }
}


class Person {
  var age: Int = 10
  var sal = 8090
  var name = null // 就是 NUll类型
  var address: String = null
  var p: String = _ //  null
  var b: Int = _
}