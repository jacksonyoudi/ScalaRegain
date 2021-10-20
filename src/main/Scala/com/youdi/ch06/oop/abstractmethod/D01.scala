package com.youdi.ch06.oop.abstractmethod

/**
 * 就是把一类事物的共有的属性和行为提取出来形成一个物理模型 模板， 这种研究问题的方法称为抽象
 */
object D01 {
  def main(args: Array[String]): Unit = {
    val account: BankAccount = new BankAccount("youdi", 100000.0, "x")
    account.query("x")
    println(account.withDraw("x", 90))
  }

}
