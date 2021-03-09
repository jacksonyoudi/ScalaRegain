package com.youdi.ch18.viewbounds

object D01 {
  def main(args: Array[String]): Unit = {
    val value: CommonCompare[Int] = new CommonCompare(1, 20)
    println(value.greater)
  }
}

// 视图界定
class CommonCompare[T <% Comparable[T]](obj1: T, obj2: T) {
  def greater = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}