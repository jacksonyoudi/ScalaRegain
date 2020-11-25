package com.youdi.ch01

object PrintD {
  def main(args: Array[String]): Unit = {
    val str1: String = "hello"
    val str2: String = " world"
    println(str1 + str2)

    val name: String = "youdi"
    val age: Int = 28

    printf("name:%s,age is %d", name, age)

    println(s"name is $name, age is ${age}")
    println(s"name is $name, age is ${age * 10}")
  }
}
