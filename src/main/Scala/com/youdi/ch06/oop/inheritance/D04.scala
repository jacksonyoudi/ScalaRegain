package com.youdi.ch06.oop.inheritance


/**
 * scala是遵守先执行  父类的 构造器
 *
 * 1. 类有一个主构造器和任意数量的辅助构造器，而每个辅助构造器都必须先调用主构造器(直接或间接)
 * 2.只有主构造器可以调用父类构造器，辅助构造器不能直接调用父类构造器。 不能使用 super(params)、
 * 3.注意构造器参数
 *
 */
object D04 {
  def main(args: Array[String]): Unit = {

  }

}

class Father(InName: String) {
  var name: String = InName

  def this() {
    this("jack")
  }
}

// 调用 Father() 只有一个出口
class Chirld(name: String) extends Father(name) {

}
