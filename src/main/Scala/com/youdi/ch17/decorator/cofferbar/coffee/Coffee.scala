package com.youdi.ch17.decorator.cofferbar.coffee

import com.youdi.ch17.decorator.cofferbar.Drink


class Coffee extends Drink {
  override def cost(): Double = {
    super.getPrice()
  }
}
