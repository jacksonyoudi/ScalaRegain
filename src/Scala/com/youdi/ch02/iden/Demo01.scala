package com.youdi.ch02.iden

/**
 * 首字符是操作符，后续字符也需要是操作符， 至少一个， 底层会变成 + -> $plus
 * 关键字可以， 需要使用 ``
 * 数字不能打头
 *
 * Int 在scala中，int不是关键字，而是预定义标识符 可以使用
 *
 * _ 有很多含义，不能使用
 *
 *
 *
 * 包名规划
 * 变量名函数名 方法名 驼峰
 */

object Demo01 {
  def main(args: Array[String]): Unit = {
      var `ture` = "hello"
      println(`ture`)
  }

}
