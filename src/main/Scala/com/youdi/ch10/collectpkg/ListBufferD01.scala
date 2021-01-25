package com.youdi.ch10.collectpkg

import scala.collection.mutable.ListBuffer

object ListBufferD01 {
  def main(args: Array[String]): Unit = {
    val lf: ListBuffer[Int] = ListBuffer[Int](1, 2, 3, 4)
    val lf1: ListBuffer[Int] = ListBuffer[Int](5, 7, 10, 12)
    for (i <- lf) {
      println(i)
    }

    // 加一个元素
    lf += 4
    lf.append(5, 6, 7)


    lf1 ++= lf

    val l2: ListBuffer[Int] = lf1 ++ lf

    val l3: ListBuffer[Int] = l2 :+ 4

    l3.remove(1)
    println(lf1)
  }
}
