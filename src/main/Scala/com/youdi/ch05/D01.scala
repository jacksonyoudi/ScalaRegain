package com.youdi.ch05


/**
 * 函数 => 方法转化
 */
object D01 {
  def main(args: Array[String]): Unit = {
    val dog: Dog = new Dog
    dog.sum(1, 2)

    // 方法转函数
    val f1: (Int, Int) => Int = dog.sum _
    println(f1)
    println(f1(1, 2))
    val f2 = (n1: Int, n2: Int) => {
      n1 + n2
    }

    println(f2)
  }


}

class Dog {
  def sum(n1: Int, n2: Int): Int = {
    return n1 + n2
  }
}