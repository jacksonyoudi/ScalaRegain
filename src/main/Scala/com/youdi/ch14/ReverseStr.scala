package com.youdi.ch14

object ReverseStr {
  def main(args: Array[String]): Unit = {
    println(reverseStr("123456"))
  }

  def reverseStr(s: String): String = {
    if (s.length == 1) s else reverseStr(s.tail) + s.head
  }

}
