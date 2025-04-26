package com.javarush.task.task01.task0101;

/* 
Я думаю, быть программистом круто
*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Сергей", 23);
        map.put("Иван", 27);
        map.put("Колян", 33);
        map.put("Никонор", null);
        map.put("Гелендж", 45);

        for (String str: map.keySet()) {
            Integer value = map.get(str);
            System.out.println(str + " --> " + value);
        }
    }
}
    // map.put("Сергей", 21);
    // map.put("Николай", 34);
