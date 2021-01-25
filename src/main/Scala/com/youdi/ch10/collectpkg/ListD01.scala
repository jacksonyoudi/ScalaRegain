package com.youdi.ch10.collectpkg

/**
 * scala中list和java list不一样，在java中list只是一个接口，真正存放数据是ArrayList,
 * 而scala的list可以直接存放数据，就是一个object，默认情况下
 * scala的list是不可变的，List属于序列Seq
 *
 *
 * List默认是不可变的集合
 * List在scala包对象中声明了，因此不需要引入其他包也可以使用的
 * val List = scala.collection.immutable.List
 * List中可以存放任何数据类型，比如List[Any]
 * 如果需要一个空列表 Nil对象
 *
 *
 *
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

    // 追加元素
    // 返回一个新的List : 靠近 List
    val l2: List[Int] = l :+ 4
    val l3: List[Int] = 8 +: l

    val l4: List[Any] = List(1, 2, 3, "abc")
    //
    //
    // 4 :: 5 :: 6 :: l4 :: -> nil =>
    val l5: List[Any] = 4 :: 5 :: 6 :: l4 :: Nil

    println(l5)
    // ::: 展平
    val l6: List[Any] = 4 :: 5 :: 6 :: l4 ::: Nil

    println(l6)

  }
}
