package com.youdi.ch10.collectpkg

/**
 * scala中list和java list不一样，在java中list只是一个接口，真正存放数据是ArrayList,
 * 而scala的list可以直接存放数据，就是一个object，默认情况下
 * scala的list是不可变的，List属于序列Seq
 *
 */
object ListD01 {
  def main(args: Array[String]): Unit = {

    // 默认情况下，引入是 scala.collection.immutable.List 不可变的， 可变的是 ListBuffer
    //  List在package object scala中  做了声明
    // val Nil = scala.collection.imutable.Nil List()

    val l: List[Int] = List(1, 2, 3)

    val nil: Nil.type = Nil
    println(nil)

  }
}
