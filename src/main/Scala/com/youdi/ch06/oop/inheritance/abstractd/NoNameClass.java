package com.youdi.ch06.oop.inheritance.abstractd;

public class NoNameClass {
    public static void main(String[] args) {

        // 匿名子类
        A2 a2 = new A2() {
            @Override
            public void say() {
                System.out.println("hello");
            }
        };
        a2.say();
    }
}

abstract class A2 {
    abstract public void say();
}
