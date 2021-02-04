package com.youdi.ch13.caseclasspkg

object SalesD {
  def main(args: Array[String]): Unit = {
    val sales: Bundle = Bundle("书籍", 10, Book("漫画", 40), Bundle("文学作品", 20, Book("<<阳关>>", 80), Book("<围城>", 30)))
    sales match {
      case Bundle(_, _, Book(desc, _), _*) => println(desc)
    }


  }
}

// 样例类
abstract class Item

case class Book(description: String, price: Double) extends Item

case class Bundle(description: String, discount: Double, item: Item*) extends Item