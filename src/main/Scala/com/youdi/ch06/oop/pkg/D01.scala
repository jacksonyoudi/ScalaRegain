package com.youdi.ch06.oop.pkg

/**
 * java包三大作用
 * 1. 区分相同名字的类
 * 2. 当类很多的时候，可以很好的管理类 命名空间
 * 3. 控制访问空间
 *
 *
 * package com.hello;
 * 打包的本质
 * 实际上就是创建不同的文件夹来保存类文件
 *
 *
 * java对包的要求
 * 1. 类的源文件，需要和包对应的文件路径匹配
 * 2. 当我们编译类，后生成对应的class文件，会放在对应的路径下
 *
 *
 * scala包的特点
 *  scala中的包名和源码所在的系统文件目录结构可以不一致，但是编译后的字节码文件目录和包名会保持一致， 工作是编译完成的
 *
 * scala包名命名
 *
 * 不能数字开头，不能使用关键字
 *
 *
 *
 * scala会自动引入的常用包
 * java.lang.*
 * scala.* 可以使用，但是下面不是可以都使用
 * predef.* 可以直接使用
 *
 *
 * scala包注意细节
 * 1. package com.youdi.edu
 *
 *
 * 2. package com.youdi
 * package edu
 *
 * 3. package a1 {
 *    package b2 {
 *
 *    }
 * }
 */

object D01 {


}
