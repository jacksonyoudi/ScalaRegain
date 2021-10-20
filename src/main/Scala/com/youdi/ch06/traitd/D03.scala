package com.youdi.ch06.traitd

object D03 {
  def main(args: Array[String]): Unit = {
    val d: D with C with B = new D with C with B
    d.insert(100)

    // 错误
//    val d1: D with C with B = new D with B with C
//    d.insert(80)
  }
}


trait A {
  def insert(id: Int)
}

/**
 * 如果我们在子特质中重写了/实现了一个父特质的抽象方法，但是，同时调用了super
 * 这时 我们的方法不是完全实现，因此需要声明为  abstract override
 * 这时 super.insert(id) 的调用和动态混入顺序有密切关系
 */


trait B extends A {
  abstract override def insert(id: Int): Unit = {
    println("insert data to B....")
    super.insert(id)
  }
}

trait C extends A {
  override def insert(id: Int): Unit = {
    println("insert data to C...." + id)
  }
}

class D {}