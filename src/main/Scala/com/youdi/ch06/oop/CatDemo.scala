package com.youdi.ch06.oop

object CatDemo {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    cat.name = "小白"
    cat.age = 10
    cat.color = "白色"
  }
}


/**
 *
 * 1. 当我们声明 var name: String时，在底层对应 private name
 * 2. 同时会生成 private name 并且会生成 public name() get和set的方法
 *
 *
 */

// 定义一个类
class Cat {
  // 声明属性
  var name: String = "" // 必须要有初始值
  var age: Int = _ //
  var color: String = _

}
