package com.youdi.ch17.factorymethod.pizzastore.pizza

class BJGreekPizza extends Pizza {
  override def prepare(): Unit = {
    this.name = "bj greek pizza"
    println("greek pizza preparing")
  }
}
