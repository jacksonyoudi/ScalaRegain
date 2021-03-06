package com.youdi.ch17.decorator.cofferbar

class Milk(obj: Drink) extends Decorator(obj) {
  setDescription("Milk")
  setPrice(2.0f)
}
