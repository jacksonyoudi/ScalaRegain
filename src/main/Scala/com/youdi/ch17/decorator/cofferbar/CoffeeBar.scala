package com.youdi.ch17.decorator.cofferbar

import com.youdi.ch17.decorator.cofferbar.coffee.Espresso

object CoffeeBar {
  def main(args: Array[String]): Unit = {
    val espresso: Drink = new Espresso
    println(espresso.getDescription())
    println(espresso.cost())

    val milk: Drink = new Milk(espresso)
    println(milk.getDescription())
    println(milk.cost())

    val chocolate: Drink = new Chocolate(milk)
    println(chocolate.getDescription())
    println(chocolate.cost())
  }
}
