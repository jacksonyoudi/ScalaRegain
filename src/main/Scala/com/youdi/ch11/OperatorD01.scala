package com.youdi.ch11


// 后置操作符

import scala.language.postfixOps

object OperatorD01 {
  def main(args: Array[String]): Unit = {
    val i: Int = 1
    val i2: Int = 110

    val res1: Int = i + i2
    val res2: Int = i.+(i2)

    var a: Int = 10


    val monster: Monster = Monster()
    monster + 10
    monster.+(10)
    monster ++

    -monster
    println(monster.money)


  }
}


class Monster {
  var money: Int = 0

  // 操作符重载 中置操作符
  def +(n: Int): Unit = {
    this.money += n
  }

  // 后置操作符
  def ++(): Unit = {
    this.money -= 100
  }

  // 前置操作符， 只能是 + - ! ~
  def unary_-(): Unit = {
    this.money = -this.money
  }

}

object Monster {
  def apply(): Monster = {
    new Monster()
  }
}

