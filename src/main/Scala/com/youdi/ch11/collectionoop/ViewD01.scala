package com.youdi.ch11.collectionoop

import scala.collection.View


/**
 * Stream的懒加载方式，也可以对其他集合应用view方法得到类似的效果
 * view具有如下效果
 * 1) view方法产出一个总是被懒加载的集合
 * 2) view不会缓存数据，每次都要重新计算，比如遍历view时。
 *
 *
 * 在使用 view时候，程序中，对集合进行map，filter,reduce, fold.........
 * 你并不希望立即执行，而是在使用结果时才执行，则可以使用view进行优化。
 *
 */
object ViewD01 {
  def main(args: Array[String]): Unit = {

    val l: IndexedSeq[Int] = (1 to 100).filter(a =>
      a.toString.equals(a.toString.reverse))


    println(l)


    val v: View[Int] = (1 to 100).view.filter(a =>
      a.toString.equals(a.toString.reverse))

      // 没有使用
    println(v)
    // 懒加载，加载的时候才使用
    v.foreach(println)
  }
}
