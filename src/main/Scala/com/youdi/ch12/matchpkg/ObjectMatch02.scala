package com.youdi.ch12.matchpkg


/**
 * 多个参数的时候，是  unapplySeq
 */
object ObjectMatch02 {
  def main(args: Array[String]): Unit = {
    val names: String = "A,b,C"
    names match {
        // 注意， 个数一定要一样
      case Names(one, two, three) => println("names=" + s"$one $two $three")
      case _ => println("nothing")
    }


  }
}


object Names {
  // 当构造器是多个参数的时候
  def unapplySeq(args: String): Option[Seq[String]] = {
    if (args.contains(",")) {
      Some(args.split(","))
    }
    else {
      None
    }
  }
}
