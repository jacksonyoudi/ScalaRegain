package com.youdi.ch10.collectpkg

object OperatorOverloadD {
  def main(args: Array[String]): Unit = {
    val cat: Cat = new Cat
    cat += 10
    print(cat.age)
  }
}

class Cat {
  var age: Int = 10

  def +=(n: Int): Unit = {
    age += n
  }
}