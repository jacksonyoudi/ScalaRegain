package com.youdi.ch10.collectpkg


/**
 * 元祖也是可以理解为一个容器，可以存放各种相同或不同类型的数据。 就是将多个无关的数据封装为一个整体。 称为元祖
 * 注意： 元祖最大只能有22个元素。
 */
object TupleD01 {
  def main(args: Array[String]): Unit = {
    val tuple: (Int, Int, Int, String, Int) = (1, 2, 3, "hello", 4)
    println(tuple)
    println(tuple._1)
    println(tuple._5)
  }
}
