package com.youdi.ch12.matchpkg


// 模式中的变量
//
object D03 {
  def main(args: Array[String]): Unit = {
    val c: Char = 'V'
    c match {
      case '+' => println("ok")
      //  表示 mychar = c  这个是一定会被匹配的
      case mychar => println("ok ->" + mychar)
      case _ => println("ok ---")
    }

    // match表达式，可以有返回值

    var ch = "+"
    var res = ch match {
      case "+" => ch + " Hello "
      case _ => println("ok")
    }


    println(res)
  }
}
