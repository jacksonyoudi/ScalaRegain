package com.youdi.ch09.implicitd

object D02 {
  def main(args: Array[String]): Unit = {
    // 编译一个隐式函数，丰富mysql功能
    implicit def addDelete(mysql: MySQL): DB = {
      new DB
    }

    val l: MySQL = new MySQL()
    l.insert()
    l.delete() // addDelete(l).delete()
  }
}


class MySQL {
  def insert(): Unit = {
    println("MySQL insert")
  }
}

class DB {
  def delete(): Unit = {
    println("DB delete")
  }
}