package com.youdi.ch02.datatype


/**
 * 字符变量使用单引号
 * 
 *
 * */

object CharDemo {
  def main(args: Array[String]): Unit = {
    var char1: Char = 97
    println(char1)

    // 1. 当把一个计算的结果赋值给一个变量，则编译器会进行类型转换及判断(范围 + 类型)
    // 2. 当把一个字面量赋值一个变量，则编译器会进行范围内判断

    //    var c2: Char = 'a' + 1
    //    var c3: Char = 97 +1
    var c4: Char = 98
  }
}
