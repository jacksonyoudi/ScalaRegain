package com.youdi.ch11.collectionoop


import scala.collection.parallel.CollectionConverters._

/**
 * Synchronized 开头的可变集合，是线程安全的
 *
 *
 * 并行集合:
 * scala为了充分使用多核CPU，提供了并行集合(有别于串行集合)，用于多核环境的并行计算
 *
 * 主要用到的算法:
 * Divide and Conquer:分治算法， scala通过splitters,combiners等抽象层来实现，主要原理是将计算工作分解很多任务，分发给
 * 一些处理器去完成，并将它们处理结果进行合并返回
 *
 * work stealin算法，主要用于任务调度负载均衡(load-balancing),通俗点完成自己所有的任务后，发现其他人任务还有活没有干完，
 * 主动(或被安排)帮他人一起干， 这样达到尽早干完的目的。
 *
 * Scala 2.13之后，并行模块变成了外部库需要在maven项目的pom.xml中手动导入：
 */
object ThreadSafetyD01 {
  def main(args: Array[String]): Unit = {

    (1 to 5).foreach(println)

    println("----------------")

    (1 to 10).par.foreach(println)

  }
}
