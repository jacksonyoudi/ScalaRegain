package com.youdi.ch12.matchpkg

object D01 {
  def main(args: Array[String]): Unit = {
    val n1: Int = 10
    val n2: Int = 10

    val op: String = "*"


    /**
     * match 和case关键字
     * 如果匹配成功，则执行 => 后面的代码
     * 匹配的顺序是从上到下，匹配到一个就执行对应的代码
     * => 后面的代码块 不要写break， 会自动退出match
     * 如果一个都没有匹配到，则执行 case _ 后面的代码
     */

    val i: Int = op match {
      case "+" => n1 + n2
      case "*" => n1 * n2
      case _ => 0
    }

    println(i)

  }
}
