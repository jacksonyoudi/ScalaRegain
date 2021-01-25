package com.youdi.ch10.collectpkg

object ArrayD01 {
  def main(args: Array[String]): Unit = {
    // 默认都是 0
    val ints: Array[Int] = new Array[Int](4) // int[] array = new int[10]
    println(ints.length)
    for (elem <- ints) {
      println(elem)
    }

    println(ints(1))
    ints(2) = 5
    for (elem <- ints) {
      println(elem)
    }

    // 使用了 apply
    // 直接初始化
    val array: Array[Any] = Array(1, 3, "xxx")
    for (elem <- array) {
      println(elem)
    }

  }

}
