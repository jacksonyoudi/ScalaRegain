package com.youdi.ch11.collectionoop



 /**
    def map[B](f:(A) => B): HashMap[B]

  1. map映射函数，所有集合类型都有
  2. [B]是泛型
  3. map是一个高阶函数，可以接收函数 f:(A) => B （可以接收一个函数的函数）
  4. HashSet[B] 就是返回的新的集合
  */
object MapOperaterD01 {
  def main(args: Array[String]): Unit = {
    val l1: List[Int] = List(3, 5, 7)
    var l2: List[Int] = List[Int]()

    for (item <- l1) {
      l2 = l2 :+ item * 2
    }

    println(l2)

    // 没有体现函数式编程 集合 -> 函数 -> 新的集合 -> 函数

  }
}
