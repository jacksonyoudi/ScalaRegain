package com.youdi.ch17.decorator.cofferbar


// 是一个抽象类
abstract class Drink {
  private var description: String = ""
  private var price: Double = 0.0f

  def setDescription(description: String): Unit = {
    this.description = description
  }

  def getDescription(): String = {
    this.description
  }

  def setPrice(price: Double): Unit = {
    this.price = price
  }

  def getPrice(): Double = {
    price
  }

  // 抽象方法
  def cost(): Double

}
