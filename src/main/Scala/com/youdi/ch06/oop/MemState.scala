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

    //
    val unit: Unit = {}
    unit.isInstanceOf[Unit] // boolean

    for (i <- (1 to 10).reverse) {
      println(i)
    }

    // 使用了高阶函数的特性
    // foreach函数(f:Int => U) 表示接收一个输入参数为Int， 输出为U的函数
    (0 to 10).reverse.foreach(println)

    // foreach表示遍历所有元素，当成参数传给println
    (0 to 10).reverse.foreach {
      i => {
        println(i)
      }
    }
    var sum: Long = 1
    "Hello".foreach(sum *= _.toLong)
    println(sum)
  }
}

class Person2 {
  var name = ""
  var age: Int = _
}
