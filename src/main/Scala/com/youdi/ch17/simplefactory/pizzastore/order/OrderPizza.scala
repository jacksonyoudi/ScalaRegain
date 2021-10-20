package com.youdi.ch17.simplefactory.pizzastore.order

import com.youdi.ch17.simplefactory.pizzastore.pizza.{GreekPizza, PepperPizza, Pizza}

import scala.util.control.Breaks._
import scala.io.StdIn

class OrderPizza {
  var orderType: String = _
  var pizza: Pizza = _

  breakable {
    do {
      println("请输入pizza类型")
      orderType = StdIn.readLine()
      //      if (orderType.equals("greek")) {
      //        this.pizza = new GreekPizza
      //      } else if (orderType.equals("pepper")) {
      //        this.pizza = new PepperPizza
      //      } else {
      //        break()
      //      }

      this.pizza = SimpleFactoryPizza.createPizza(orderType)
      if (pizza == null) {
        break()
      }
      this.pizza.prepare()
      this.pizza.bake()
      this.pizza.cut()
      this.pizza.box()
    } while (true)

  }

}
