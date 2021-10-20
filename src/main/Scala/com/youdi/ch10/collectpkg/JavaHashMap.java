package com.youdi.ch10.collectpkg;


import java.util.HashMap;

public class JavaHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("100", 100);
        map.put("200", 200);
        map.put("300", 300);

        System.out.println(map);
        System.out.println(map.get("300"));
    }
}
