package com.youdi.ch05.mexception


/**
 * 在scala中只有一个catch，可以有多个case ex
 * finally最后执行的
 *
 * scala没有编译异常这个概念
 * throw抛出异常 Nothing
 */
object ScalaEx {

  def main(args: Array[String]): Unit = {
    try {
      val a :Int = 0
      val b :Int = 100
      val c = b / a

    } catch {
      case ex: ArithmeticException => {
        println("捕获了除数为0的算术异常")
      }
        case ex: Exception => {
          println("捕获了异常")
        }
    }
    finally {
      println("scala finally")
    }

    println("Ok")
  }
}
