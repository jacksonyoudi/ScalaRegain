package com.youdi.ch06.oop.inheritance

class Person {
  var name: String = _
  var age: Int = _

  def info(): Unit = {
    println("name:" + name + " age:" + age)
  }
}

class Student extends Person {
  def studying(): Unit = {
    println("studying....")
  }
}