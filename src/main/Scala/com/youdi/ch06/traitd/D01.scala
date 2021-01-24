package com.youdi.ch06.traitd


/**
 * 带有特质的对象，动态混入
 * 1. 除了继承特质，还可以混入
 * 2. 可以应用于对象类功能扩展
 * 3. 动态混入是scala特有的方式，可在不修改类声明/定义的情况下，扩展类的功能，非常灵活 耦合性低
 * 4. 动态混入可以在不影响原有的继承关系的基础上，给指定的类扩展功能。
 */
object D01 {
  def main(args: Array[String]): Unit = {

    val oracle: Oracle with DB = new Oracle with DB
    oracle.insert(100)


    val l: MySQL with DB = new MySQL with DB
    l.insert(80)

    //    new MySQL{} // 表示匿名子类

    val pq: PQ with DB = new PQ with DB {
      override def say(): Unit = {
        println("hello")
      }
    }

    pq.say()
    pq.insert(70)

  }
}


trait DB {
  def insert(id: Int): Unit = {
    println("插入数据= " + id)
  }
}


class Oracle {

}

abstract class MySQL {

}

abstract class PQ {
  def say()
}