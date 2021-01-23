package com.youdi.ch06.oop.inheritance;


/**
 * 子类和父类的有相同的字段， 使用父类的引用就是父类，  父类和子类字段是不同的存储， 隐藏了。
 *
 * java动态绑定
 *
 * 1. 如果调用是方法，则jvm机将该方法和对象的内存地址绑定
 * 2. 如果调用的是一个属性，则没有动态绑定机制，在哪里调用，就是哪个。
 */
public class JavaOverrideField {
    public static void main(String[] args) {
        Sub sub = new Sub();
        System.out.println(sub.s);
        System.out.println(((Super) sub).s);
        Super sp = new Sub();
        System.out.println(sp.s);
    }
}

class Super {
    String s = "super";
}

class Sub extends Super {
    String s = "sub";
}
