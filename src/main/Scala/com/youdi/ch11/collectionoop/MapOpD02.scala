package com.youdi.ch11.collectionoop

object MapOpD02 {
  def main(args: Array[String]): Unit = {
    val l1: List[Int] = List(3, 5, 7)
    val l2: List[Int] = l1.map(multiple)
    // 1. 首先 将 list 集合元素依次遍历，将各个元素传递给multiple 新的值
    // 将新值 放到新的集合并返回


    println(l2)


    println(MyList(1, 2, 3, 4).map(multiple))
  }


  def multiple(n: Int): Int = {
    println("调用")
    2 * n
  }
}


class MyList(inList: List[Int]) {
  val l1: List[Int] = inList
  var l2: List[Int] = List[Int]()

  // 写 map
  def map(f: Int => Int): List[Int] = {
    for (item <- l1) {
      l2 = l2 :+ f(item)
    }

    l2
  }

}

object MyList {
  def apply(l: Int*): MyList = {
    new MyList(l.toList)
  }
}

