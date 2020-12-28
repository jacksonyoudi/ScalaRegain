package com.youdi.ch02.datatype

object TypeDemo02 {
  def main(args: Array[String]): Unit = {

  }


  /**
   * 表示没有正常值返回
   * @return
   */
  def sayHello(): Nothing = {
    throw new Exception("ex")
  }

}
