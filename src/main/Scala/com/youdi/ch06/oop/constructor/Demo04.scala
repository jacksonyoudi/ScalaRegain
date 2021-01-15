package com.youdi.ch06.oop.constructor

object
Demo04 {
  def main(args: Array[String]): Unit = {
    val w = new Worker("a")
    val w2 = new Worker01("a")
    w2.iName

    val w3 = new Worker02("a")
    w3.iName
    w3.iName = "b"
  }
}

/**
 *
 * @param iName
 * 1. 如果主构造器中 worker(iName:String) 那么iName就是一个局部变量（）
 * 2. 如果使用了val关键字声明，那么scala会将参数作为类的私有的只读属性使用
 * 3.
 *
 */
class Worker(iName: String) {


}

// 是iName的私有属性，是只读属性
class Worker01(val iName: String) {
  val name: String = iName
}


// 是iName的私有属性，是可读写的属性
class Worker02(var iName: String) {
  val name: String = iName
}