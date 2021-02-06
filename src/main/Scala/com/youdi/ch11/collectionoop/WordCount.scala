package com.youdi.ch11.collectionoop

import scala.collection.mutable

object WordCount {
  def main(args: Array[String]): Unit = {
    val l1: List[String] = List("annnnn ddd hello word texst word", "hello word nest test xixi", "nihao test youdi name")

    val map: mutable.Map[String, Int] = mutable.Map[String, Int]()


    l1.flatMap(_.split(" ")).foldLeft(map)((map, b) => {
      map(b) = map.getOrElse(b, 0) + 1
      map
    }).toList.sortWith(
      (a, b) => {
        a._2 >= b._2
      }
    ).foreach(println)


    println("-======================================")
    val c1: Map[String, Int] = l1.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).mapValues(_.size)
    print(c1.toMap)

  }
}
