package com.youdi.ch06.traitd

/**
 * 在特质中 ，既有抽象方法，又有非抽象方法， 就是富接口
 *
 * 特质中的具体字段是  父特质中的字段直接加入到子类中
 *
 *
 */
object D04 {
  def main(args: Array[String]): Unit = {
    val cc: CC with Mn = new CC with Mn {
      override var sal = 100
    }
    println(cc.name)
  }

}


trait Mn {
  var name: String = "jack"
  var sal: Int
}

class CC {}