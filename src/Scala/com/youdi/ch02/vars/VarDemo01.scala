package com.youdi.ch02.vars

object VarDemo01 {
  def main(args: Array[String]): Unit = {
    var age: Int = 10
    var sal: Double = 10.9
    val a: String = "a"

    println(s"name is ${sal * 2}, age is ${age}")
  }
}
