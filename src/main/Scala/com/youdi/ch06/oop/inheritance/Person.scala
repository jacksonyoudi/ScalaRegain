package com.youdi.ch06.oop.inheritance

class Person {
  var name: String = _
  var age: Int = _

  def info(): Unit = {
    println("name:" + name + " age:" + age)
  }
}

class Student extends Person {


  override def info(): Unit = {
    println("stu name:" + name + " age:")
  }

  def studying(): Unit = {
    println("studying....")
  }
}

class Emp extends Person {
  def say(): Unit = {
    println("hello")
  }
}