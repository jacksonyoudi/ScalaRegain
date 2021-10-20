package com.youdi.ch12.matchpkg


/**
 * 变量中的匹配
 *
 *
 */
object MacthVar {
  def main(args: Array[String]): Unit = {
    val (x, y) = (1, 2)
    val (q, r) = BigInt(10) /% 3
    val arr = Array(1, 7, 2, 9)
    val Array(one, two, _*) = arr

  }

}
