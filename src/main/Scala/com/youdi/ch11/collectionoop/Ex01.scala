package com.youdi.ch11.collectionoop

import scala.collection.mutable
import scala.collection.mutable.{ArrayBuffer, Map}

object Ex01 {
  def main(args: Array[String]): Unit = {
    val l1: List[String] = List("alice", "bob", "NIck")
    val l2: List[String] = l1.map(_.toUpperCase)
    println(l2)


    val a: String = "AAAAAAAAAAABBBBBBCCCCDDDDDD"

    val b: ArrayBuffer[Char] = new ArrayBuffer[Char]()
    a.foldLeft(b)((b, a) => {
      b.addOne(a)
    })

    println(b)


    val c: String = "abcdbdddbadddddcccdddvvvadddavdssssnnn"

    val map: mutable.Map[Char, Int] = mutable.Map[Char, Int]()

    //    c.foldLeft(map)(
    //      (map, b) => {
    //        if (map.contains(b)) {
    //          map(b) += 1
    //        } else {
    //          map(b) = 1
    //        }
    //        map
    //      }
    //    )

    c.foldLeft(map)((map, b) => {
      map(b) = (map.getOrElse(b, 0) + 1)
      map
    })


    println(map)
  }
}
