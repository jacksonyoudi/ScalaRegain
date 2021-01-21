package com.youdi.ch06.oop.inheritance


/**
 * 继承： 代码复用
 * 代码的扩展性和维护性提高[修改父类属性和方法]
 */
object D01 {
  def main(args: Array[String]): Unit = {
    val student: Student = new Student()
    student.info()
    student.studying()
  }
}
