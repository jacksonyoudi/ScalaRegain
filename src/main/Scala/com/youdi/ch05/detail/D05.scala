package com.youdi.ch05.detail

object D05 {
  def main(args: Array[String]): Unit = {
    println(sum(1, 2, 3, 4))
    val value: List[Int] = List(1, 2, 3)
  }

  def sum(args: Int*): Int = {
    var sum: Int = 0
    for (i <- args) {
      sum += i
    }
    return sum
  }

}
