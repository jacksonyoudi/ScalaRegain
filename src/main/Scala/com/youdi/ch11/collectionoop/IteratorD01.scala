package com.youdi.ch11.collectionoop


/**
 * iterator的构建实际上是 AbstractIterator的一个匿名子类，该子类提供了
 *
 * override def iterator: Iterator[A] = new AbstractIterator[A] {
 * private[this] var current: Iterable[A] = toIterable
 * def hasNext = !current.isEmpty
 * def next() = { val r = current.head; current = current.tail; r }
 *
 *
 * 该AbstractIterator子类提供了hasNext next等方法
 * 因此，我们使用while的方式，使用hasNext next方法变量
 */
object IteratorD01 {
  def main(args: Array[String]): Unit = {
    val l1: List[Int] = List(1, 3, 4, 5)
    val iterator: Iterator[Int] = l1.iterator
    for (i <- iterator) {
      println(i)
    }

    println("-------------------")

    while (iterator.hasNext) {
      println(iterator.next())
    }

  }
}
