package com.youdi.ch09.implicitd


/**
 * 隐式值：
 *
 * 默认值和隐式值都有的情况， 隐式值优先级高于 默认值 匹配不上也是使用 默认值
 * 当没有隐式值和默认值， 并且没有参数的情况下，就会报错
 *
 *
 * 参数 > 隐式值 > 默认值
 * 在隐式值匹配时，不能有二义性
 */
object D03 {
  def main(args: Array[String]): Unit = {
    implicit val str1: String = "jack"

    //  implicit name: String 表示隐式参数
    def hello(implicit name: String): Unit = {
      println(name)
    }

    hello // hello(str1) 不能带参数

  }
}
