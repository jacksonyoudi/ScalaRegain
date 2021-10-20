package com.youdi.ch12.matchpkg


/**
 * 类型匹配
 * 可以匹配对象的类型， 这样可以避免了使用isInstanceOf和asInstanceOf方法
 *
 * 1.Map[String, Int]和Map[Int, String]是不同类型的
 * 2. 在进行类型匹配的时候，编译器会预先检测是否有可能的匹配，如果没有则报错。
 * 3. 变量
 * 4. 隐藏变量名
 *
 */
object D04 {
  def main(args: Array[String]): Unit = {
    val a: Int = 1

    val obj: Any =
      if (a == 1) 1

      else if (a == 2) "2"
      else if (a == 3) BigInt(3)
      else if (a == 4) Map("aa" -> 1)
      else if (a == 5) Map(1 -> "aa")
      else if (a == 6) Array(1, 2, 3)
      else if (a == 7) Array("aa", 3)
      else if (a == 8) Array("aa")


    val res: Any = obj match {
      case a: Int => a
      case b: Map[String, Int] => "对象是 Map[String, Int]"
      case c: Map[Int, String] => "obj is Map[Int, String]"
      case d: Array[String] => "obj is Array[String]"
      case e: Array[Int] => "obj is Array[Int]"
      case f: BigInt => Int.MaxValue
      case _ => "啥也不是"
    }

    println(res)
  }
}
