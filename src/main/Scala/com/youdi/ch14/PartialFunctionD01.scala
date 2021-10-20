package com.youdi.ch14

object PartialFunctionD01 {
  def main(args: Array[String]): Unit = {
    val list: List[Any] = List(1, 2, 3, 4, "abc")
    // 定义一个偏函数
    // 表示接收 Any 返回 Int
    // isDefinedAt如果返回true，就会调用 apply 构建实例 如果false,过滤
    // apply 构造器，对传入的值 + 1并返回(新的集合)
    val pf: PartialFunction[Any, Int] = new PartialFunction[Any, Int] {
      // 如果
      override def isDefinedAt(x: Any) = x.isInstanceOf[Int]

      override def apply(v1: Any) = v1.asInstanceOf[Int] + 1
    }


    // 使用偏函数 使用 collect函数
    // 偏函数执行流程
    // if else
    // 1. 先遍历 list 所有元素
    // 2. 然后 调用 if (PartialFunction isDefinedAt(list单个元素)) {}
    val result: List[Int] = list.collect(pf)
    println(result)


    // 化简形式
    def f2: PartialFunction[Any, Int] = {
      case i: Int => i + 1 // case语句可以自动转换为偏函数
    }

    println(list.collect(f2))


    // 简化形式2

    val l3: List[Int] = list.collect {
      case i: Int => i + 1
    }

    println(l3)

  }

}
