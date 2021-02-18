package com.youdi.ch17.simplefactory.pizzastore.pizza

class PepperPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "PepperPizza"
    println("PepperPizza  preparing")
  }
}
