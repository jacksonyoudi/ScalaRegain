package com.youdi.ch06.oop.bean

import scala.beans.BeanProperty


/**
 * 对象创建的流程分析
 * 1. 加载类的信息(属性信息，方法和属性)
 * 2. 在内存堆开辟空间 （方法区）
 * 3. 构造器初始化对象属性
 * 4.
 */
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