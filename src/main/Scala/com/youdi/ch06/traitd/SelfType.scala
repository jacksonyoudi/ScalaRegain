package com.youdi.ch06.traitd

object SelfType {
  def main(args: Array[String]): Unit = {

  }
}


/**
 * Logger自身类型特质，
 *
 * trait Logger extends Exception 要求混入该特质的类也是  Exception子类
 */
trait Logger {
  this: Exception =>
  def log(): Unit = {
    println(getMessage)
  }
}

//class Console extends Logger{}
class Console2 extends Exception with Logger