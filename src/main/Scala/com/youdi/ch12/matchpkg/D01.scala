package com.youdi.ch12.matchpkg


/**
 * 1. 如果不配，那么会执行case _
 * 2. 如果所有case都不匹配，又没有写case _ 分支，那么会抛出 MatchError
 * 3. 每个case中，不用break语句，自动中断case
 * 4. 可以在match中使用其他类型，而不仅仅是字符
 * 5. =>
 */
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
      case 10 => 10
      case _ => 0
    }

    println(i)

  }
}
