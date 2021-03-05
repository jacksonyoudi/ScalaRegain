package com.youdi.ch17.singleton

class D02 {
  def main(args: Array[String]): Unit = {
    val instance1: SigleTon2 = SigleTon2.getInstance
    val instance2: SigleTon2 = SigleTon2.getInstance
  }
}


class SigleTon2 private() {}

// 饿汉式
object SigleTon2 {
  private val s: SigleTon2 = new SigleTon2

  def getInstance = {
    s
  }
}