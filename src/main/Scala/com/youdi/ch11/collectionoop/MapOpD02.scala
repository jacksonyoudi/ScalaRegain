package com.youdi.ch11.collectionoop

object MapOpD02 {
  def main(args: Array[String]): Unit = {
    val l1: List[Int] = List(3, 5, 7)
    val l2: List[Int] = l1.map(multiple)
    // 1. 首先 将 list 集合元素依次遍历，将各个元素传递给multiple 新的值
    // 将新值 放到新的集合并返回


    println(l2)
  }


  def multiple(n: Int): Int = {
    println("调用")
    2 * n
  }
}

