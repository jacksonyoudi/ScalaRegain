package com.youdi.ch11.collectionoop


/**
 * 化简： 将二元函数引用于集合中的函数
 *
 *
 * reduceLeft:   def reduceLeft[B >: A](op: (B, A) => B): B = {
 *
 *
 */

object ReduceD01 {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = (1 to 10).toList
//    val i: Int = list.reduceLeft((a, b) => a + b)
    val i: Int = list.reduceLeft(_ + _)
    println(i)
  }
}
