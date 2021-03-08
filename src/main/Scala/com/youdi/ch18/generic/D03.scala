package com.youdi.ch18.generic

object D03 {
  def main(args: Array[String]): Unit = {
    val ints: List[Int] = List[Int](1, 3, 4, 5, 6)
    val strings: List[String] = List[String]("a", "b", "c")
    println(midList(ints))
    println(midList(strings))
  }

  def midList[E](l: List[E]): E = {
    l(l.length / 2)
  }

}
