package com.youdi.ch17.factorymethod.pizzastore.order

import com.youdi.ch17.factorymethod.pizzastore.pizza.Pizza

import scala.util.control.Breaks.breakable


abstract class OrderPizza {
  var orderType: String = _
  var pizza: Pizza = _
  breakable {

  }


  // 抽象方法 子类实现
  def createPizza(t: String): Pizza

}
