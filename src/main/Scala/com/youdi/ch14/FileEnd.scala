package com.youdi.ch14


/**
 * 闭包的好处
 * 1. 参数传入一次，可以多次使用
 */
object FileEnd {
  def main(args: Array[String]): Unit = {
    def makeSuffix(x: String) = {
      (fileName: String) => {
        if (fileName.endsWith(x)) {
          fileName
        } else {
          fileName + x
        }
      }
    }

    val f1: String => String = makeSuffix(".jpg")
    print(f1("a"))


  }


}
