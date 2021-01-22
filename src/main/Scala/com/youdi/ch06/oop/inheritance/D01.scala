package com.youdi.ch06.oop.inheritance


/**
 * 继承： 代码复用
 * 代码的扩展性和维护性提高[修改父类属性和方法]
 *
 * 子类继承了所有属性，只是私有的属性不能直接访问，需要通过公共的方法去访问，
 *
 *
 * 公共方法: private, protected(底层是public), 默认是 public
 *
 * protected: 子类可以使用，同包其他类不能使用
 *
 *
 *
 */
object D01 {
  def main(args: Array[String]): Unit = {
    val student: Student = new Student()
    student.info()
    student.studying()
  }
}
