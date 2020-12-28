package com.youdi.ch04.forf


// 纯函数
object D07 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3; j = i * 2) {
      println("i:" + i + " j:" + j)
    }

    // 等价
    for {i <- 1 to 3
         j = i * 2} {
      println("i:" + i + " j:" + j)
    }
  }

}
