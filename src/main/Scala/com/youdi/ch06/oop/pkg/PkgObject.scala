package com.youdi.ch06.oop.pkg


/**
 * 包对象
 * 基本介绍： 包可以包含类，对象和特质trait, 但不能包含函数,方法或变量的定义，这是java虚拟机的局限，为了弥补这一点的不足， scala提供了包对象这个概念。
 *
 *
 * 在包中直接定义函数和方法是会报错的 =》 使用包对象的技术来解决
 *
 *
 *
 * class object
 * 伴生对象和伴生类
 * 因为scala设计者将static拿掉了， 加了 object
 * 伴生类 写 非静态的内容， 伴生对象 就是静态内容
 *
 * 私有属性可以在class和 object中访问
 *
 * 增加 权限访问
 * private[scala]
 */

object PkgObject {
  def main(args: Array[String]): Unit = {

  }

}
