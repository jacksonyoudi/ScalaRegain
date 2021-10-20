package com.youdi.ch06.oop.pkg

import scala.beans.BeanProperty

/**
 *
 *
 *  1. scala中 import 可以出现在任何地方，建议在需要时，再引入。缩小范围， 效率比较高。
 *  2. scala中 import _ 所有内容
 *  3. import com.{a, b} 可以使用选择器，选择需要使用的包
 *  4. 重命名 import java.util.{HashMap => javaHashMap, List}
 *  5. 表示隐藏 import java.util.{HashMap => _, _}
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
