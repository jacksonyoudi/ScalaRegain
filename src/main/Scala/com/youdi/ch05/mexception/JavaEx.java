package com.youdi.ch05.mexception;

/**
 * @program: ScalaRegain
 * @description: demo
 * @author: changyouliang
 * @date: 2021/01/03
 *
 *
 *
 * java的异常处理 try-catch-catch-finnally
 * 范围小的写在前面， 范围大的写在后面
 *
 *
 * scala使用模式匹配
 *
 **/
public class JavaEx {
    public static void main(String[] args) {
        try {
            int i = 0;
            int b = 10;
            int c = b / i;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("java finally");
        }

        System.out.println("ok");
    }
}
