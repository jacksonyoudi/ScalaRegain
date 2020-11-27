package com.youdi.ch02.dataconvert

/**
 * byte short char三者可以运算， 首先转换成int类型
 *  自动提升原则： 表达式结果的类型自动提升为 操作数中最大的类型
 */


object Demo01 {
  def main(args: Array[String]): Unit = {
    var n1 = 10
    var n2 = 1.1f

    var n3 = n1 + n2


  }
}
