package com.youdi.ch12.matchpkg

object MatchList {
  def main(args: Array[String]): Unit = {

    for (list <- Array(List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0), List(88))) {
      val str = list match {
        // 以0开头的 一个元素
        case 0 :: Nil => "0"
        // 有两个元素
        case x :: y :: Nil => x + " " + y
        // 以0开头的元素， tail是变量名
        case 0 :: tail => "0 ..."
        case x :: Nil => x
        case _ => "something else"
      }

      println(str)

    }

  }
}
