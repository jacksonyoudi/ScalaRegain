package com.youdi.ch06.traitd


/**
 * scala中创建对象共有几种方式
 * 1. new
 * 2. apply
 * 3. 匿名子类方式
 * 4. 动态混入
 *
 *
 * 叠加特质
 *
 * 构建对象的同时如果混入多个特质，称为 叠加特质
 * 那么 特质声明顺序从左到右，方法执行顺序从右到左
 * scala叠加特质的时候，会首先从后面的特质开始执行
 *
 * 如果想直接调用特质的方法 super[特质],必须 是直接的超类
 *
 *
 */

object D02 {
  def main(args: Array[String]): Unit = {

    // 创建对象时，动态混入了 DB  File
    //  创建动态混入特质对象时，顺序是什么样的？
    // 1. 按对象创建顺序，调用过的父类，就会跳过  insert -> Data -> DBops -> file
    val phoenix: Phoenix with DBOPS with File = new Phoenix with DBOPS with File
    // 2. 执行顺序  从右到左 栈  File -> 当执行到super时，是指左边的特质 DBOPS
    // 如果左边没有特质，则  super就是父特质

    // File -> DB -> data 插入数据=
    phoenix.insert(100)


    // insert -> Data -> file -> DBops
    val phoenix1: Phoenix with DBOPS with File = new Phoenix with File with DBOPS

    //DB ->  File  -> data 插入数据=
    phoenix1.insert(80)

  }
}

trait Insert {
  println("insert")

  // 抽象方法
  def insert(id: Int)
}

// 特质继承
trait Data extends Insert {
  println("Data")

  // 实现
  override def insert(id: Int): Unit = {
    println("data 插入数据= " + id)
  }
}


trait DBOPS extends Data {
  println("DBops")

  override def insert(id: Int): Unit = {
    print("DB ")
    super.insert(id)
  }
}

trait File extends Data {
  println("file")

  override def insert(id: Int): Unit = {
    println("File")
    super.insert(id)
    // 如果希望直接指定 Data
//    super[Data].insert(id)
  }
}


class Phoenix {}