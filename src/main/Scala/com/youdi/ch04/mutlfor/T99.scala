package com.youdi.ch04.mutlfor

object T99 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 until 10) {
      for (j <- 1 until 10) {
        printf(i + " * " + j + " = " + (i * j) + " ")
      }
      println()
    }
  }
}
