package com.youdi.ch10.collectpkg

import scala.collection.mutable

object QueueD01 {
  def main(args: Array[String]): Unit = {
    val q1: mutable.Queue[Int] = new mutable.Queue[Int]
    println(q1)
    q1 += 9
    println(q1)
    q1 ++= List(4, 5, 6)
    println(q1)

    //    q1 += List(1, 2)
    //    println(q1)

    // 出队, 从头部
    q1.dequeue()
    println(q1)
    //
    q1.enqueue(10)

    println(q1)
  }
}


