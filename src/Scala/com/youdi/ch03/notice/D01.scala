package com.youdi.ch03.notice


/**
 * 3 目运算符 if () one else two
 *
 * 保留一种风格
 *
 *
 * 运算符的优先级
 * 单目运算  从右向左
 *
 * ()[]优先级最高
 * 单目运算符
 * 算术运算符
 * 移位运算符
 * 比较运算符
 * 位运算符
 * 关系运算符
 * 赋值运算符
 *
 */
object D01 {
  def main(args: Array[String]): Unit = {
    val num = if (5 > 4) 5 else 4
    println(num)
  }
}



