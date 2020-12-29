package com.youdi.ch05.func


/**
 *
 *  1. 返回值类型没有， 表示返回类型任意
 *
 */

object D01 {
  def main(args: Array[String]): Unit = {

  }

  def getRes(n1: Int, n2: Int, operation: String): Int = {
    if (operation == '+') {
      n1 + n2
    } else if (operation == '-') {
      n1 - n2
    } else {
      0
    }
  }
}
