package com.youdi.ch11.collectionoop

object Ex01 {
  def main(args: Array[String]): Unit = {
    val l1: List[String] = List("alice", "bob", "NIck")
    val l2: List[String] = l1.map(_.toUpperCase)
    println(l2)
  }
}
