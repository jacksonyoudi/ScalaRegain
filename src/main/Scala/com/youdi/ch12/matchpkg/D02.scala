package com.youdi.ch12.matchpkg

object D02 {
  def main(args: Array[String]): Unit = {


    for (ch <- "+-3!") {
      var sign: Int = 0
      var digit: Int = 0
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        case _ if ch.toString.equals("3") => digit = 3 // 忽略得到的值 如果 case _ 后面有 条件守卫， 表示忽略  传入
        case _ => sign = 2
      }

      println(ch + " " + sign + " " + digit)

    }
  }
}
