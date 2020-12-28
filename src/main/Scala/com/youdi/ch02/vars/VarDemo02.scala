package com.youdi.ch02.vars

object VarDemo02 {
  def main(args: Array[String]): Unit = {
    // 类型推导
    // 类型确定了，就不能修改了，说明scala是数据类型语言
    var num = 10

    println(num.isInstanceOf[Int])
    num = 1

    /**
     * var 是可以修改值的
     * val修饰的变量是不可改变的
     * (1) 在实际编程，我们更多的需求是获取/创建一个对象后，读取该对象的属性，或者修改对象的属性值,但是很少修改对象本身
     *      val没有线程安全问题，因此效率高，scala设计者推荐我们val  底层相当于 final
     * (2)  如果对象需要改变，使用var
     */
  }
}
