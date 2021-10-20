package com.youdi.ch13.caseclasspkg

import com.youdi.ch13.Currency

object D01 {
  def main(args: Array[String]): Unit = {
    val currency: Currency = Currency(3000, "$")
    val currency1: Currency = currency.copy() // 克隆， 创建的对象和 currency 属性值是一样的
    println(currency.hashCode())
    println(currency1.hashCode())

    println(currency)
    println(currency1)


    val currency2: Currency = currency.copy(value = 8000)
    println(currency2)
  }

}
