package com.youdi.ch05.detail

object D02 {
  def main(args: Array[String]): Unit = {
    sayHello()
    sayHello("rose")
  }

  def sayHello(name: String = "jackson"): Unit = {
    println(name)
  }
}
