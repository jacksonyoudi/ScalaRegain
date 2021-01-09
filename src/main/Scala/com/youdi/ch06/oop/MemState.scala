package com.youdi.ch06.oop

object MemState {
  def main(args: Array[String]): Unit = {
    val p1: Person2 = new Person2
    p1.name = "jack"
    p1.age = 10

    println(p1)
    val p2: Person2 = p1
    println(p2)
    p2.age = 90
    println(p1.age)

  }
}

class Person2 {
  var name = ""
  var age: Int = _
}
