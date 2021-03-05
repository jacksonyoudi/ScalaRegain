package com.youdi.ch17.factorymethod.pizzastore.pizza

class GreekPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "greek pizza"
    println("greek pizza preparing")
  }
}
