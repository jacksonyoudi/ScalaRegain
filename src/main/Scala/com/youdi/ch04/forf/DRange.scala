package com.youdi.ch04.forf

object DRange {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10) {
      println(i)
    }

    // 控制步长
    for (i <- Range(1, 10, 2)) {
      println(i)
    }

    for (i <- 1 to 10 if i % 2 == 1) {
      println(i)
    }

  }
}
