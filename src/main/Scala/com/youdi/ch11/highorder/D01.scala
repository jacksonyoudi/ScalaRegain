package com.youdi.ch11.highorder

object D01 {

  def main(args: Array[String]): Unit = {
    print(test(sum _, 3.5))
//    val f1 = myprintln _ // 不会执行
//    val f1 = myprintln // 会执行
      val f1 = myprintln _
    //f1 // 不会执行
    f1()  // 会执行

  }

  // 在scala中可以当成一个变量，赋值给一个变量


  // n1是参数
  def test(f: Double => Double, n1: Double): Double = {
    f(n1)
  }

  def sum(d: Double): Double = {
    d + d
  }

  def myprintln(): Unit = {
    println("hello")
  }

}
