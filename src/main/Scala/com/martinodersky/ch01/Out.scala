package com.martinodersky.ch01


/**
 * 可以使用 scaladoc -d  ./ 生成对应文档说明
 */

object Out {
  def main(args: Array[String]): Unit = {
    var name: String = "hello"
    println(name)
    println(s"${name}")
    printf("%s", name)
  }

}
