package com.youdi.ch12.matchpkg


/**
 * 对象匹配，
 * 1. case中对象的unapply方法(对象提取器)返回some集合则为匹配成功
 * 2. 返回None集合，则是失败
 */
object ObjectMatch {
  def main(args: Array[String]): Unit = {

    val d: Double = 36.0 // Square(6.0)

    d match {
      // case Square(n) 运行机制
      //  当匹配到 Square(n)
      // 会调用 Square的 unapply 方法
      // 如果调用的是 Some(6), 则表示匹配成功，同时，将6赋值给n
      // 如果返回是 None,表示匹配不成功
      case Square(n) => println(n)
      case _ => println("nothing")
    }
  }
}


object Square {
  // 对象提取器
  // 接收z:Double 类型
  // 返回类型 Option[Double]
  // 返回值是Some(math.sqrt(z)) 返回z的开平方
  def unapply(z: Double): Option[Double] = {

        println("unapply被调用")
    //    Some(math.sqrt(z))
    None
  }

  def apply(z: Double): Double = {
    z * z
  }
}
