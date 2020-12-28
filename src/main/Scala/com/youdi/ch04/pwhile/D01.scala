package com.youdi.ch04.pwhile


object D01 {
  def main(args: Array[String]): Unit = {
    var flag: Int = 0
    while (flag < 10) {
      println("hello:" + flag)
      flag += 1
    }
  }
}
