package com.youdi.ch05.recursive

object D01 {
  def main(args: Array[String]): Unit = {

  }


  def fbn(n: Int): Int = {
    if (n == 1 || n == 2) {
      1
    } else {
      fbn(n - 1) + fbn(n - 2)
    }
  }
}
