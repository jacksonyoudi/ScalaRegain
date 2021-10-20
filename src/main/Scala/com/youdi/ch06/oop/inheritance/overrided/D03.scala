package com.youdi.ch06.oop.inheritance.overrided

object D03 {

}


/**
 * 在A03中，有一个抽象的字段(属性)
 * 1. 抽象的字段(属性)：就是没有初始化的字段(属性)
 * 2. 当一个类中含有抽象属性时，则该类需要标记为abstract
 * 3. 对于抽象的属性，在底层不会生成对应的属性声明，而是生成了两个对应的抽象方法(name(), name_$eq())
 *
 * var重写var属性小结
 * 1. 一个属性没有初始化，那么这个属性就是抽象属性
 * 2. 抽象属性的编译成字节码文件时，属性并不会声明，但是会自动生成抽象方法，所以类必须声明为抽象类
 * 3. 如果覆写一个父类的抽象属性，那么override关键字可省略 原因是父类的抽象属性生成了抽象方法，
 *
 */
abstract class A03 {
  var name: String
}


class SubA03 extends A03 {
  /**
   * 1. 如果我们在子类中去重写
   */
  override var name: String = _
}