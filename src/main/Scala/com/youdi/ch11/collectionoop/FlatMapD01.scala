package com.youdi.ch11.collectionoop



object FlatMapD01 {
  def main(args: Array[String]): Unit = {
    val l1: List[String] = List("alice", "bob", "NIck")
    val list: List[Char] = l1.flatMap(_.toUpperCase)
    println(list)
  }
}
