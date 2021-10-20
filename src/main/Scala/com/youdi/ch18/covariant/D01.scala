package com.youdi.ch18.covariant

object D01 {
  def main(args: Array[String]): Unit = {

    // 不变
    val t1: Temp3[Sub] = new Temp3[Sub]("hello")
    val t2: Temp2[Super] = new Temp2[Sub]("xiix")

    val value: Temp1[Sub] = new Temp1[Super]("hello")



  }
}

// 逆变
class Temp1[-A](title: String) {
  override def toString: String = {
    title
  }
}



// 协变
class Temp2[+A](title: String) {
  override def toString: String = {
    title
  }
}





// 不变
class Temp3[A](title: String) {
  override def toString: String = {
    title
  }
}

class Super

class Sub extends Super