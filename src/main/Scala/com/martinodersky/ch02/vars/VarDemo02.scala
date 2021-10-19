package com.martinodersky.ch02.vars

object VarDemo02 {
  var age: Int = 10
  var address: String = "sz"

  def main(args: Array[String]): Unit = {
    val i = 10
    println(i)
    println(i.isInstanceOf[Int])
  }

  def hello(): Unit = {
    
  }
}

