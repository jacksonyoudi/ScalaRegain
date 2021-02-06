package com.bigdata.sparkpkg.ch05.sparkcore.test

class Task extends Serializable {
  val datas: List[Int] = List(1, 2, 3, 4)

  val logic: (Int) => Int = _ * 2

  def compute(): List[Int] = {
    datas.map(logic)
  }

}
