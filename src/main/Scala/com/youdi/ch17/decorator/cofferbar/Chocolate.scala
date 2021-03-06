package com.youdi.ch17.decorator.cofferbar

class Chocolate(obj: Drink) extends Decorator(obj) {
  super.setDescription("Chocolate")
  super.setPrice(10.0f)
}
