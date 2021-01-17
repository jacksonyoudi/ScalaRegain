package com.youdi.ch06.oop.construct

/**
 *
 * 对象创建流程分析
 * 1. 加载类信息(属性和方法信息) 方法区
 * 2。 在内存中(堆)开辟空间
 * 如果有父类，先初始化父类
 * 3. 使用主构造器对属性进行初始化
 * 4. 使用辅助构造器对属性进行初始
 * 5. 将开辟的内存地址赋给引用
 */

object D1 {

}

class Person(inName: String, inAge: Int) {
  var name: String = inName
  var age: Int = inAge
}
