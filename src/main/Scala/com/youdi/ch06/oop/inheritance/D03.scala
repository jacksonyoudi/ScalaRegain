package com.youdi.ch06.oop.inheritance


/**
 * 要测试某个对象是否属于某个类， 可以使用isInstanceOf,用asinstanceof方法将引用转换成子类的引用， classof获取对象的类名
 *
 * 使用价值根据类型，进行使用 ，多态
 */
object D03 {
  def main(args: Array[String]): Unit = {
    // 获取类名
    println(classOf[String])

    val king: String = "king"
    // 使用反射机制
    println(king.getClass.getName)

    val person: Person = new Person
    // 将子类向上转型
    val student: Person = new Student

    // 将父类的引用重新转成子类引用(多态) 向下转型
    val student1: Student = student.asInstanceOf[Student]

    student1.studying()

    val emp: Emp = new Emp
    test(emp)
    test(student1)
  }

  def test(p: Person): Unit = {
    if (p.isInstanceOf[Student]) {
      // p.asInstanceOf[Student] 返回一个新的类
      p.asInstanceOf[Student].studying()
    } else if (p.isInstanceOf[Emp]) {
      p.asInstanceOf[Emp].say()
    }
  }


}


//class Person {
//
//}
//
//class Student extends Person {}
