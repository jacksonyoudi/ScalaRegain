package com.youdi.ch11.collectionoop

//import scala.collection.parallel.CollectionConverters._
import scala.collection.parallel.immutable.ParSeq

object ParD01 {
  def main(args: Array[String]): Unit = {
    val r1: IndexedSeq[String] = (1 to 100).map {
      case _ => Thread.currentThread.getName
    }.distinct

    println(r1)

    val r2: ParSeq[String] = (1 to 100).par.map {
      case _ => Thread.currentThread.getName
    }.distinct

    println(r2)

  }
}
