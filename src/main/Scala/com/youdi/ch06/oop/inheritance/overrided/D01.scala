package com.youdi.ch06.oop.inheritance.overrided


/**
 * 覆写字段注意事项和细节
 * 1.def只能重写另一个def，方法只能重写另一个方法
 * 2.val只能重写另一个val属性 或 重写不带参数的def  (父类是 var, 子类 val就会报错)
 * 3.var只能重写另一个抽象的var属性
 *    抽象属性：声明未初始化的变量就是抽象的属性，抽象属性在抽象类
 *
 * 注意底层是  method， 所有的属性都是 private
 */
object D01 {
  def main(args: Array[String]): Unit = {
    val a: A = new B()
    println(a.age)
    val b: B = new B()
    println(b.age)
  }

}


class A {
  // 生成public age()
  val age: Int = 10

  def name(): String = {
    "jack"
  }

}

class B extends A {
  // 生成public age()
  override val age: Int = 20
  override val name: String = "tom"
}