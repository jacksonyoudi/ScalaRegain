package com.youdi.ch06.traitd

/**
 * 所有混入该特质的类，会自动成为那个特质所继承的超类的子类
 *
 *
 * 如果混入该特质的类，已经给继承了另一个类，则要求A类的特质超类的子类。否则就会发生多继承了。
 */
object D06 {
  def main(args: Array[String]): Unit = {

  }
}


// 继承
trait LoggedException extends Exception {
  //  override def getMessage: String = {
  //
  //  }
}