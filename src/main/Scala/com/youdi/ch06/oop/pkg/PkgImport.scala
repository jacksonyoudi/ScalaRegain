package com.youdi.ch06.oop.pkg

import scala.beans.BeanProperty


/**
 *
 */
object PkgImport {
  def main(args: Array[String]): Unit = {


  }
}

class Manager {
  // 第一种方式 [使用相对路径]
  @BeanProperty var name: String = _
 // 相对路径
  @scala.beans.BeanProperty var age: Int = _
  // 绝对路径， 使用情况是 出现冲突的时候
  @_root_.scala.beans.BeanProperty var id: Int = _

}
