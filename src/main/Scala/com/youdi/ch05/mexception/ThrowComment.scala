package com.youdi.ch05.mexception

object ThrowComment {
  def main(args: Array[String]): Unit = {
    f1()
  }

  // 等同于 java
  @throws(classOf[NumberFormatException])
  def f1() = {
    "abc".toInt
  }
}
