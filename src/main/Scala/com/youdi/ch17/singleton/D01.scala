package com.youdi.ch17.singleton

object D01 {
  def main(args: Array[String]): Unit = {
    val instance: SigleTon = SigleTon.getInstance
    println(instance)
    val instance2: SigleTon = SigleTon.getInstance
    println(instance2)
  }
}


class SigleTon private() {}


// 懒汉式
object SigleTon {
  private var s: SigleTon = null

  def getInstance = {
    if (s == null) {
      s = new SigleTon
    }
    s
  }
}