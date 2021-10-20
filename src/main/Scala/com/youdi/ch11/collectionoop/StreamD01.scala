package com.youdi.ch11.collectionoop


/**
 * stream是一个集合，这个集合，可以用于存放无穷多个元素，但是这个元素并不会一次性生产出来， 而是需要 用到多大的区间
 * 就会动态的生产， 末尾元素遵循lazy规则。 （要使用结果才进行计算）
 *
 * 注意： 不能使用last属性 ，如果使用last集合就会进行无限循环
 */
object StreamD01 {
  def main(args: Array[String]): Unit = {
    def numStream(n: BigInt): Stream[BigInt] = n #:: numStream(n * n)

    val stream: Stream[BigInt] = numStream(1)


    println(List(1,2,3,4).map(numStream(_)))


  }
}
