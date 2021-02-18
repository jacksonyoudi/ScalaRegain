package com.youdi.ch17.simplefactory.pizzastore.order

import com.youdi.ch17.simplefactory.pizzastore.pizza.{GreekPizza, PepperPizza, Pizza}

/**
 * 提供一个专门创建pizza的类，有需要创建pizza调用该方法即可。不用多个地方修改
 */

object SimpleFactoryPizza {
  def createPizza(t: String): Pizza = {
    var pizza: Pizza = null
    if (t.equals("greek")) {
      pizza = new GreekPizza
    } else if (t.equals("pepper")) {
      pizza = new PepperPizza
    }
    pizza
  }

}
