package com.youdi.ch18.upperbounds


/**
 * 对于下界，可以传入任意类型
 * 传入和animal直系的 按父类处理
 * 无关的，都是object处理
 */
object D01 {
  def main(args: Array[String]): Unit = {
    val value: CommonCompare[Integer] = new CommonCompare(Integer.valueOf(10), Integer.valueOf(20))
    println(value.geater)


    val v: CommonCompare[java.lang.Float] = new CommonCompare[java.lang.Float](10.1f, 2.1f)
    println(v.geater)
  }
}


class CompareInt(n1: Int, n2: Int) {
  def geater = if (n1 > n2) n1 else n2
}

// T <: Comparable[T] T是 Comparable的接口
// 通用性更好
class CommonCompare[T <: Comparable[T]](obj1: T, obj2: T) {
  def geater = if (obj1.compareTo(obj2) > 0) obj1 else obj2
}