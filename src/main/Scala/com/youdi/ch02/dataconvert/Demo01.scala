package com.youdi.ch02.dataconvert

/**
 * byte short char三者可以运算， 首先转换成int类型
 *  自动提升原则： 表达式结果的类型自动提升为 操作数中最大的类型
 *
 *
 *  强制类型转换
 *  1. 大-> 小
 *  2. 强转符号只针对最近的操作数有效，使用() 提升优先级
 *  3. char类型可以保存int类型， 但是不能保存int的变量值
 *  4. byte和short类型转换在进行运算时，当做int类型处理
 */


object Demo01 {
  def main(args: Array[String]): Unit = {
    var n1 = 10
    var n2 = 1.1f

    var n3 = n1 + n2


  }
}
