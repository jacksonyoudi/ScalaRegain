package com.youdi.ch10.collectpkg

import scala.collection.mutable

object SetD01 {
  def main(args: Array[String]): Unit = {
    val s: Set[Int] = Set(1, 2, 3)

    val s2: mutable.Set[Int] = mutable.Set(1, 2, 3)
    s2.add(4)
    s2 += 5
    // 原地操作
    s2 -= 2
    s2.remove(3)

    print(s2)

    println(s2.max)
    println(s2.min)

  }
}
