package com.youdi.ch04.forf

object D06 {
  def main(args: Array[String]): Unit = {

    /**
     * 1 to 10 遍历
     * yield i 将每次循环得到i放入到集合vector中，并返回给res
     * i 可以是代码块，可以对i进行逻辑处理
     *
     * scala的语法重点： 就是将一个集合中的各个数据进行处理，并返回给新的集合
     */

    val res = for (i <- 1 to 10) yield i * 2
    println(res)

    val res1 = for (i <- 1 to 10) yield  {
      if (i % 2 == 0) {
        i
      } else {
        "不是偶数"
      }
    }
    println(res1)

  }
}
