package com.youdi.ch05.mexception

object ThrowDemo {
  def main(args: Array[String]): Unit = {

    try {
      val value: Nothing = test()
      println(value)
    } catch {
      case ex: Exception => {
        println(ex.getMessage)
      }
    }



    println("ok")
  }


  def test(): Nothing = {
    throw new Exception("异常")
  }
}
