package com.youdi.ch06.interfaced


/**
 * scala中没有接口
 * 1. scala采用特质trait  替代接口概念 (interface  + abstract class)
 * 2. 实现 + 动态混入(mixin)
 * 3. 在scala中，java中的接口都可以当成trait使用
 *
 *
 *
 * trait使用
 * 一个类具有某种特质，就意味着这个类满足了这个特质的所有要素，所以在使用时，也采用了extends关键字，如果
 * 有多个特质或存在父类，那么需要使用with关键字连接
 *
 * 没有父类
 * class 类名 extends 特质1 with 特质2 with 特质3
 *
 * 有父类
 * class 类名 extends 父类 with 特质1 with 特质2
 *
 */
object D02 {

}


// 在scala中，java中的接口都可以当成trait使用
object T1 extends Serializable {

}