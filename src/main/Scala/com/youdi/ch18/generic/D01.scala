package com.youdi.ch18.generic

object D01 {

}


abstract class Message[T](s: T) {
  def get = s
}

class IntMessage[Int](v: Int) extends Message(v)