package com.youdi.ch12.matchpkg

object MatchFor {
  def main(args: Array[String]): Unit = {
    val map: Map[String, Int] = Map("a" -> 1, "b" -> 0, "c" -> 3)
    for ((k, v) <- map) {
      println(k + "->" + v)
    }

    for ((k, 0) <- map) {
      println(k + " --> 0")
    }

    for ((k, v) <- map if v == 0) {
      println(k + " -> " + v)
    }
  }
}
