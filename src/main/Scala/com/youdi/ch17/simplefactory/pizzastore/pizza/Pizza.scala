package com.youdi.ch17.simplefactory.pizzastore.pizza

abstract class Pizza {
  var name: String = _

  // 抽象方法
  def prepare()

  def cut(): Unit = {
    print(this.name + " cutting.... ")
  }


  def bake(): Unit = {
    print(this.name + " bake.... ")
  }

  def box(): Unit = {
    print(this.name + " boxing.... ")
  }
}
