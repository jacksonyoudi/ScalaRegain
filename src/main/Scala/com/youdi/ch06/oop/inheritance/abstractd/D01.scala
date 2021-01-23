package com.youdi.ch06.oop.inheritance.abstractd

object D01 {
  def main(args: Array[String]): Unit = {


    // 匿名子类
    val animal: Animal = new Animal {

      override def say(): Unit = {
        println("xixi")
      }

      override def cry(): Unit = {
        println("cry")
      }

      override var name = "one"
      override var age = 10
    }
  }
}


/**
 * 抽象类
 * 抽象属性和抽象方法只有没有对应的内容就可以了
 *
 *
 * 抽象类的价值 更多在于价值  是设计者设计好后，让子类继承，必须按规则写
 *
 *
 * 抽象类的细节：
 * 1. 抽象类中可以有实现的方法
 * 2. 抽象类不能实例化 (可以通过匿名类的方式)
 * 3. 一旦类中包含了抽象属性或方法，继承子类必须实现
 * 4. 抽象方法和抽象属性，不能使用权限修饰词
 * 5. 子类重写抽象方法和属性，可以不使用 override
 *
 */
abstract class Animal {
  var name: String //  抽象字段
  var age: Int
  var color: String = "black" // 普通字段
  def cry() // 抽象方法
  def say(): Unit = {
    println("hello")
  }
}