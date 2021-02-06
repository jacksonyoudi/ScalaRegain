package com.bigdata.sparkpkg.ch05.sparkcore.test

class SubTask extends Serializable {
  var datas: List[Int] = List(1, 2, 3, 4)

  var logic: (Int) => Int = _

  def compute(): List[Int] = {
    datas.map(logic)
  }


}
