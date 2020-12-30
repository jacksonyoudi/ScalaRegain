package com.youdi.ch05.detail

object D01 {
  def main(args: Array[String]): Unit = {

    def f1(): Unit = {
      println("f1")
    }

    println("ok")

    def sayHello(): Unit = { // private final sayHello$1
      println("sayHello")
    }

  }

  def sayHello(): Unit = { // 成员
    println("Hello")
  }


}
