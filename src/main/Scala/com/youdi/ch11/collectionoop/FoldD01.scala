package com.youdi.ch11.collectionoop

// fold函数将上一步返回的值作为函数的第一个参数继续传递参与运算，直达list中所有元素被遍历。
// 可以把reduceLeft看做简化版的foldLeft
object FoldD01 {
  def main(args: Array[String]): Unit = {
    val l2: List[Int] = List(1, 2, 3, 4)
    val i: Int = l2.foldLeft(5)(_ - _) // 函数柯里化
    println(i)

    println(l2.foldRight(5)(_ - _)) // reduceRight(1,2,3,4,5)

    // 缩写
    val i1: Int = (5 /: l2) (_ - _) // l2.foldLeft(5)(_ - _)
    val i2: Int = (l2 :\ 10) (_ - _) // l2.foldRight(5)(_ - _)



  }

}
