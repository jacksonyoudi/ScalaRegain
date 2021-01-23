package com.youdi.ch06.oop.inheritance.staticd

object D02 {
  def main(args: Array[String]): Unit = {
    new Chirld("jack")
    val chirld: Chirld = new Chirld("tom")
    Chirld.join(chirld)
    println(Chirld.getTotal)
  }
}

class Chirld(cName: String) {
  val name: String = cName
  Chirld.total += 1
}

object Chirld {
  var total: Int = 0

  def getTotal(): Int = total

  def join(chirld: Chirld): Unit = {
    total += 1
  }
}
