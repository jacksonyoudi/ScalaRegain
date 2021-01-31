package com.youdi.ch12.matchpkg

object D05 {
  def main(args: Array[String]): Unit = {
    val arrs: Array[Array[Int]] = Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 1, 0))

    for (arr <- arrs) {
      val result = arr match {
        case Array(0) => "0"
        case Array(x, y) => Array(y, x).toList.toString
        case Array(0, _*) => "以0开头的数组"
        case _ => "什么集合都不是"
      }
      println("result=" + result)

    }


    // array(10,20) => array(20, 10)


  }
}
