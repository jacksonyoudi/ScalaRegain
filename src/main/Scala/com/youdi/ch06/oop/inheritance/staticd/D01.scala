package com.youdi.ch06.oop.inheritance.staticd


/**
 * scala中静态的概念 -- 伴生对象， 模拟静态的东西
 *
 * 1. 伴生对象是使用 object, 伴生对象都是 "静态",  Person.MODULE 是 final 类型
 * 2. 伴生对象就是类的静态方法和成员的集合
 * 3. scala还是没有生成静态的内容， 只不过是将伴生对象生成一个新的类， 实现属性和方法的调用
 * 4. 从底层看， 伴生对象实现静态的特性是依赖于 public static final MODULE$实现的。
 * 5. 伴生对象和伴生类的声明在同一个源码文件中
 * 6. class
 *
 */
object D01 {
  def main(args: Array[String]): Unit = {
    //    new
    val person: Person = new Person()
    println(person.name)

    println(Person.sex) // 底层是 Person$.MODULE$.sex()
  }
}

/**
 *  1. 当在一个文件中 有class和object， class是伴生类， 非静态， object是伴生对象， 是静态的内容
 *     2. 对于伴生对象中内容可以使用伴生对象的名字来访问
 */
// 伴生类 生成的是 Person.class
class Person {
  var name: String = _
}


// 伴生对象 ， 生成的是Person$.class
object Person {
  var sex: String = "man"
}
