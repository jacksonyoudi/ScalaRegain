package com.youdi.ch18.generic

object D02 {
  def main(args: Array[String]): Unit = {
    val a: EnglishClass[SeasonEnum.SeasonEnum, String, String] = new EnglishClass[SeasonEnum.SeasonEnum, String, String](SeasonEnum.spring, "a", "110")
    println(a.name)
  }
}

class EnglishClass[A, B, C](val season: A, val name: B, val typ: C)

// 枚举类型
object SeasonEnum extends Enumeration {
  type SeasonEnum = Value
  val spring, autumn, summer, winnter = Value
}

