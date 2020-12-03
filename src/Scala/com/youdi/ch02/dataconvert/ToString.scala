package com.youdi.ch02.dataconvert


/**
 * 基本类型转string +
 * string转基本类型使用 to
 * 注意： 一定是合法的数值
 * "11.2".toInt会报错
 *
 */
object ToString {
  def main(args: Array[String]): Unit = {
    var a: String = "1111" + 22222
    // 错误的
    val c: Int = "3333.44".toInt
  }
}
