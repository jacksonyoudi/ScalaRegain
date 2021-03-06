package com.youdi.ch14

/**
 * 1. 抽象控制是没有输入没有输出的
 * 2. 参数是函数(代码块)
 */
object AbstractControll2 {
  def main(args: Array[String]): Unit = {


    def myRunInThread(f: (Int) => Unit, x: Int) = {
      new Thread {
        override def run() = {
          f(x)
        }
      }.start()
    }


    myRunInThread(
      (x) => {
        println(x)
        Thread.sleep(5000)
        println("done")
      }, 55
    )


    def myRunInThread2(f: => Unit) = {
      new Thread {
        override def run() = {
          f
        }
      }.start()
    }

    // 没有输入和输出的， 可以写成如下：
    myRunInThread2 {
      println("sellp")
      Thread.sleep(5000)
      println("done")
    }
  }
}
