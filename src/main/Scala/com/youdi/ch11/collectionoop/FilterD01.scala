package com.youdi.ch11.collectionoop


/**
 * filter签名   override def filter(p: A => Boolean): List[A] = filterCommon(p, isFlipped = false)
 */
object FilterD01 {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = (1 to 10).toList
    val l1: List[Int] = list.filter(_ % 2 == 0)
    println(l1)
  }
}
