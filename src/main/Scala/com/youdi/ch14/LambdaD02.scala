package com.youdi.ch14


/**
 * 1. (x: Double) => 3 * x 就是匿名函数
 * 2. (x: Double) 形参列表， => 规定语法表示后面是函数体， 3 *x 就是函数体， 如果多行，可以换成 {} 换行写
 * 3. f1 是指向匿名函数的变量
 * 4. 匿名函数的返回类型是 自行推导的
 */
object LambdaD02 {
  def main(args: Array[String]): Unit = {
    val f1: Double => Double = (x: Double) => 3 * x

    println(f1)
    println(f1(3.4))


  }
}
