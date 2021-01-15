package com.youdi.ch06.oop.bean

import scala.beans.BeanProperty

object Demo01 {
  def main(args: Array[String]): Unit = {
    val car: Car = new Car()
    car.setName("bbb")
    car.getName
    car.name = "aa"
    car.name
  }
}


class Car() {
  @BeanProperty var name: String = null
}