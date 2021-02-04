package com.youdi.ch13.caseclasspkg


/**
 * 不想接收某些值，则使用 _ 忽略， _* 忽略所有
 * 通过@表示法将嵌套的值绑定到变量，  _*绑定剩余的Item 到rest
 */
object SalesD {
  def main(args: Array[String]): Unit = {
    val sales: Bundle = Bundle("书籍", 10, Book("漫画", 40), Bundle("文学作品", 20, Book("<<阳关>>", 80), Book("<围城>", 30)))
    sales match {
      case Bundle(_, _, Book(desc, prize), _*) => println(desc, prize)
    }


    val tuple: (Book, Seq[Item]) = sales match {
      case Bundle(_, _, art@Book(_, _), rest@_*) => (art, rest)
    }
    println(tuple)

    //

    val tuple1: (Book, Item) = sales match {
      case Bundle(_, _, art@Book(_, _), rest) => (art, rest)
    }
    println(tuple1)

    println(this.price(sales))
  }


  def price(it: Item): Double = {
    it match {
      case Book(_, p) => p
      case Bundle(_, dis, its@_*) => its.map(price).sum - dis
    }
  }
}

// 样例类
abstract class Item

case class Book(description: String, price: Double) extends Item

case class Bundle(description: String, discount: Double, item: Item*) extends Item