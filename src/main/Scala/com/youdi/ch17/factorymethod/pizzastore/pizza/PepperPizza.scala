package com.youdi.ch17.factorymethod.pizzastore.pizza

class PepperPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "PepperPizza"
    println("PepperPizza  preparing")
  }
}
