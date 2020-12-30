package com.youdi.ch05.detail

object D03 {
  def main(args: Array[String]): Unit = {
    print(f1(3))
  }

  // recursive method f1 needs result type
  def f1(n: Int): Int = {
    if (n == 1) {
      1
    } else {
      f1(n - 1)
    }
  }
}
