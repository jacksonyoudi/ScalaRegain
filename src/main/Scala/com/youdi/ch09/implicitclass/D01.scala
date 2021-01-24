package com.youdi.ch09.implicitclass


/**
 * 隐式类
 * 1. 其所带参数有且只有一个
 * 2. 隐式类必须被定义在 "类" 或 "伴生对象" 或 "包对象" 里，即 隐式类不能是顶级的 (top -level )
 * 3. 隐式类不能是 case class
 * 4. 作用域 不能有与之相同名称的标识符
 *
 *
 *
 * 隐式转换
 */
object D01 {
  def main(args: Array[String]): Unit = {
    implicit class DB(val m: MySQL) {
      def addSuffix(): Unit = {
        print("DB")
      }
    }
    val l: MySQL = new MySQL()
    l.addSuffix // DB(l).addSuffix
  }
}


class MySQL {
  def say(): Unit = {
    print("OK")
  }
}
