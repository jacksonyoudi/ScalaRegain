package com.youdi.ch10.collectpkg

object MultiArray {
  def main(args: Array[String]): Unit = {
    val array: Array[Array[String]] = Array.ofDim[String](3, 4)
    for (a <- array) {
      for (b <- a) {
        println(b)
      }
    }


    print(array(1)(1))
  }
}
