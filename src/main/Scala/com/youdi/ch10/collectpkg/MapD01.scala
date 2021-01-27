package com.youdi.ch10.collectpkg

import scala.collection.mutable


/**
 * 确定map有key, 直接使用 map(key)效率最高
 * 不能确定map是否有key， 而有不同的业务逻辑，使用 map.contains()
 * 如果希望有一个值， 就使用map.getElse()
 *
 *
 */

// 默认是 imutable.Map
object MapD01 {
  def main(args: Array[String]): Unit = {

    // 每对key-value是Tuple2, 不可变的map是有序的
    val map: Map[String, Int] = Map("a" -> 10, "b" -> 20)
    println(map)

    // 可变的map
    val m2: mutable.Map[String, Int] = mutable.Map[String, Int]("a" -> 10, "b" -> 20)

    val m3: mutable.HashMap[String, Int] = new mutable.HashMap[String, Int]
    m3.put("a", 10)

    // 使用对偶元祖
    val m4: Map[String, Int] = Map(("a", 10), ("b", 20))


    // 如果没有key，会报异常
    print(m4("a"))

    println(m4.contains("a"))

    // get返回Some，None
    println(m4.get("a").get)


    println(m4.getOrElse("a", 20))

    m2("aa") = 4

    m2 += ("d" -> 4, "f" -> 10)
    m2 += ("c", 6)

    m2 -= ("a", "b")


    m2.remove("a")


    for ((k, v) <- m2) {
      println(k, v)
    }

    for (item <- m2) {
      println(item._1, item._2)
    }

    for (k <- m2.keys) {
      println(k)
    }

    for (v <- m2.values) {
      println(v)
    }

  }
}
