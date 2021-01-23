package com.youdi.ch06.applyd

object D01 {
  def main(args: Array[String]): Unit = {

    val pig: Pig = Pig()
    println(pig.name)

    val pig1: Pig = Pig("toc")
    println(pig1.name)

  }
}


class Pig(iName: String) {
  var name: String = iName
}


object Pig {
  def apply(iName: String): Pig = new Pig(iName)

  def apply(): Pig = {
    new Pig("jack")
  }
}