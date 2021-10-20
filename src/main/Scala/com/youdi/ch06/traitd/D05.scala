package com.youdi.ch06.traitd

object D05 {
  def main(args: Array[String]): Unit = {

    /**
     * 先调用当前类的超类构造器
     * 第一个特质的父类构造器
     * 第二个特质构造器。。。
     * 当前类构造器
     * EE ->  AA  -> CC -> -> BB ->DD -> FF
     *
     */
    val ff: FF = new FF() // 实际是构建类对象，在混入特质时， 该对象还没创建

    // 先创建kk, 再混入 EE -> KK -> AA -> CC ->BB -> DD
    val kk: KK  = new KK with CC with DD // 实际是匿名子类， 可以立即成混入特质时， 该对象已经 创建了。
  }
}


trait AA {
  println("AA")
}

trait BB extends AA {
  println("BB")
}

trait CC extends AA {
  println("CC")
}

trait DD extends BB {
  println("DD")
}

class EE {
  println("EE")
}

class FF extends EE with CC with DD {
  println("FF")
}

class KK extends EE {
  println("KK")
}
