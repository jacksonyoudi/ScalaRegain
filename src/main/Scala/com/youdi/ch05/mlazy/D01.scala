package com.youdi.ch05.mlazy

object D01 {
  def main(args: Array[String]): Unit = {
    lazy val res = sum(1, 2)
    println("------------")
    println(res)
  }

  def sum(n1: Int, n2: Int): Int = {
    println("sum")
    n1 + n2
  }
}
