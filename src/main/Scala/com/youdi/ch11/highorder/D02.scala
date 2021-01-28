package com.youdi.ch11.highorder

object D02 {
  def main(args: Array[String]): Unit = {
    test2(say) // ok的
    test2(say _) //
  }

  // 说明是一个无参的高阶函数
  def test2(f: () => Unit): Unit = {
    f()
  }

  def say(): Unit = {
    println("hello")
  }

}
