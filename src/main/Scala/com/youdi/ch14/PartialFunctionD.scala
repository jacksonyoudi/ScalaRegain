package com.youdi.ch14


/**
 *
 */
object PartialFunctionD {

  def main(args: Array[String]): Unit = {

    val list: List[Any] = List(1, 2, 3, 4, "abc")
    // filter  + map  不够高效， 中间有一个 any => Int
    val l2: List[Int] = list.filter(_.isInstanceOf[Int]).map(_.asInstanceOf[Int]).map(_ + 1)
    println(l2)


    // 模式匹配
    list.map(
      _ match {
        case x: Int => x + 1
        case _ =>
      }
    ).foreach(println)

  }
}
