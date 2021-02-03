package com.youdi.ch13.caseclasspkg

object MidCase {
  def main(args: Array[String]): Unit = {
    List(1, 2, 3, 5, 9) match {
      case first:: second :: rest => println(rest)
    }
  }
}
