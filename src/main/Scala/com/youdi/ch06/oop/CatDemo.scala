package com.youdi.ch06.oop


/**
 * 类是抽象的，概念的，代表一类事物
 * 对象是具体的，实际的，代表一个具体的事物
 * 类是对象的模板，对象是类的一个个个体，对应一个实例
 * scala中中类和对象的区别和联系和java中一样的
 */
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
 * 3. public name_$eq("")
 *
 */

// 定义一个类
class Cat {
  // 声明属性
  var name: String = "" // 必须要有初始值
  var age: Int = _ //
  var color: String = _

}
