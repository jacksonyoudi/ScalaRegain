package com.youdi.ch02.datatype

/**
 * scala一切皆对象
 * method如果没有参数，可以省略()
 *
 * 类型两大类: anyval   anyref
 *
 *
 * 底层类  null 所有anyref
 *  Nothing -> 所有类的子类
 *
 *  1. 一切皆对象
 *  2. any  anyref anyvar
 *  3. 复杂的数据类型
 *
 * any是所有类型的父类
 * Null是scala的特殊类型，它只有一个值null bottonclass anyref的子类
 * Nothing是botton class
 *
 * 低精度值向高进度自动转换 隐式转换
 *
 *
 * Unit void  ()
 */

object TypeDemo01 {
  def main(args: Array[String]): Unit = {
    val i: Int = 10

    i.toDouble
    i.toString

    say
  }

  def say(): Unit = {
    println("hello")
  }
}

