package com.youdi.ch08

/**
 * 类有5大成员
 * 1. method
 * 2. 属性
 * 3. 内部类
 * 4. 构造器
 * 5. 代码块  --》 静态代码
 */
object D01 {
  def main(args: Array[String]): Unit = {
    val clazz: OuterClass = new OuterClass()
    val clazz1: OuterClass = new OuterClass()


    // 成员内部类, scala 内部类实例和外部对象关联
    clazz.name = "tom"
    val clazz2: clazz.InnerClass = new clazz.InnerClass()
    val clazz3: clazz1.InnerClass = new clazz1.InnerClass()
    clazz2.info()
    clazz2.test(clazz3)


    // 静态内部类实例
    val clazz4: OuterClass.StaticInnerClass = new OuterClass.StaticInnerClass()

  }
}


/**
 * 可以使用别名方式
 *
 * 类型投影： OuterClass#InnerClass 解决外部对象对内部对象的影响
 */
class OuterClass {

  myInner =>

  class InnerClass {
    // 访问方式是 外部类名.this.属性名
    def info(): Unit = {
      println(
        OuterClass.this.name + OuterClass.this.sal
      )

      println("============")
      println(name + sal)

      println("============")
      println(myInner.name + myInner.sal)
    }

    def test(ic: OuterClass#InnerClass): Unit = {
      print(ic)
    }
  }

  var name: String = "jack"
  private var sal: Int = 30000

}


object OuterClass {

  class StaticInnerClass {}

}
