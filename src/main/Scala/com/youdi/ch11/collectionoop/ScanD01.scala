package com.youdi.ch11.collectionoop


/**
 * 扫描: 某个集合的所有元素做fold操作，但是会把产生的所有中间结果放置于一个集合中保存
 */
object ScanD01 {
  def main(args: Array[String]): Unit = {

    // 第一元素，先保留 Vector(5, 4, 2, -1, -5, -10)
    val list: IndexedSeq[Int] = (1 to 5).scan(0)(_ + _)
    println(list)
  }
}
