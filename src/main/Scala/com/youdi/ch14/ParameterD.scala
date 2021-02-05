package com.youdi.ch14


/**
 * 参数推断省去类型信息(在某些情况下[需要应用场景]，参数类型是可以推断出来的，同时也可以进行相应的简写)
 *
 * 1. 参数类型是可以推断时，可以省略参数类型
 * 2. 当传入的参数，只有单个参数时， 可以省去括号
 * 3. 如果变量只在 => 右边出现一次， 可以使用 _ 来代替。
 */
object ParameterD {
  def main(args: Array[String]): Unit = {
    val l: List[Int] = List(1, 2, 3, 4, 5)

    println(l.map((x: Int) => x + 1))
    println(l.map((x) => x + 1))
    println(l.map(x => x + 1))
    println(l.map(_ + 1))

    val add = (x: Int, y: Int) => x + y

    l.reduce(_ + _)
    l.reduce(add)


  }
}
