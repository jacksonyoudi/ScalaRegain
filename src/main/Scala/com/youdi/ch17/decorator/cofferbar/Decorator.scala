package com.youdi.ch17.decorator.cofferbar


class Decorator extends Drink {
  private var obj: Drink = null

  def this(obj: Drink) = {
    this
    this.obj = obj
  }

  override def cost(): Double = {
    super.getPrice() + obj.cost()
  }

  override def getDescription(): String = {
    super.getDescription() + "&&" + obj.getDescription()
  }
}
