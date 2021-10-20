package com.youdi.ch14


/**
 *
 * 1. 在对符合某个条件，而不是所有清苦进行逻辑操作时， 使用偏函数是一个不错的选择
 * 2. 将包在大括号内的一组case语句封装为函数，我们称为偏函数，它只会对作用于指定类型的参数或指定范围的参数实施计算，超出范围的值会忽略(未必忽略，这取决怎么处理)
 * 3. 偏函数在scala中是一个特质  PartialFunction
 *
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
