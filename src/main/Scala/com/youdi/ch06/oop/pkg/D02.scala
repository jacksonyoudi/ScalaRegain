
// 表示我们创建了一个包 com.youdi.oop.pkg
// 可以继续写子包
/**
 * 还可以写类 特质 还可以写 object
 *
 * scala中支持 在一个文件中，可以同时创建多个包，以及给各个包创建类，trait，object等
 *
 * 作用域原则
 * 可以直接向上访问
 * scala中子包中直接访问父包中内容，大括号体现作用域
 * 父包要访问子包中的内容，必须要使用 import
 * 可以多个package
 * 包名import可以相对路径或绝对路径
 *
 */
package cn.youdi.oop.pkg {

  class User {

  }

  object C {
    def main(args: Array[String]): Unit = {
      import cn.youdi.oop.pkg.b1.D02
      val d: D02 = new D02
    }
  }

  // cn.youdi.oop.pkg.b1的包对象的包对象
  // 每一个包都可以有一个包对象，而且只能有一个
  // 包对象的名称必须要和子包一致
  // 在包对象中可以定义变量和方法，就可以在对应的包中使用
  // 在包对象定义的  方法和变量，可以在对应子包中直接使用
  // 在底层会生成2个类一个是 package.class， 一个是 package$.class
  package object b1 {
    val name: String = "jack"
    val age: Int = 10

    def say(): Unit = {
      println("hi")
    }
  }

  package b1 {

    class D02 {
    }

    object T {
      def main(args: Array[String]): Unit = {
        println("hello")
        // 如果有重名的类，采用就近原则
        // 如果使用父包的类，就使用 全路径
        val user = new User // 就近原则，
        println(name)
        println(age)
        say
      }
    }

  }

}
