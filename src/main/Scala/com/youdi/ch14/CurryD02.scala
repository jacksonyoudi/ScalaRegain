package com.youdi.ch14

/**
 * 函数柯里化： 拆分更小的函数， 粒度更小
 */
object CurryD02 {
  def main(args: Array[String]): Unit = {

    def eq(s1: String, s2: String): Boolean = s1.equals(s2)

    implicit class TestEq(s: String) {
      def checkEq(ss: String)(f: (String, String) => Boolean): Boolean = {
        f(s.toLowerCase, ss.toLowerCase)
      }
    }

    val hello: String = "hello"
    println(hello.checkEq("s")(eq))



  }

}
