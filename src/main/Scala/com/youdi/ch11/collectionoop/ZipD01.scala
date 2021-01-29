package com.youdi.ch11.collectionoop

object ZipD01 {
  def main(args: Array[String]): Unit = {
    val l1: List[Int] = List(1, 2, 3, 4)
    val l2: List[Int] = List(5, 6, 7, 8)
    val l3: List[(Int, Int)] = l1.zip(l2) // 对偶元祖
    println(l3)

  }

}
