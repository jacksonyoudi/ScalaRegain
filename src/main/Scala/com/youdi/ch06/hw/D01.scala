package com.youdi.ch06.hw


object D01 {
  def main(args: Array[String]): Unit = {
    type MyInt = Int // 取别名
    val i: MyInt = 888
    println(i)

    println(Suits)
  }
}

object Suits extends Enumeration {
  type Suits = Value
  val hongtao: Suits = Value("hongtao")

  override def toString(): String = {
    hongtao.toString
  }
}