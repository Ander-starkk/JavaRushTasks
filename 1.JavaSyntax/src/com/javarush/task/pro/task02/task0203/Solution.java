package com.javarush.task.pro.task02.task0203;

import java.math.BigDecimal;
import java.util.*;
/* 
Последняя цифра числа
*/

public class Solution {

    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportsAndNames.put(162348, "Иван Михайлович Серебряков");
        passportsAndNames.put(8082771, "Дональд Джон Трамп");

        String lidiaName = passportsAndNames.get(212133);
        System.out.println(lidiaName);


        passportsAndNames.remove(162348);
        System.out.println(passportsAndNames);
        System.out.println(passportsAndNames.containsKey(212133));
        System.out.println(passportsAndNames.containsValue("Дональд Джон Трамп"));

        Set<Integer> keys = passportsAndNames.keySet();
        System.out.println("Ключи: " + keys);

        ArrayList<String> values = new ArrayList<>(passportsAndNames.values());
        System.out.println("Значения: " + values);

    }
}
//     int age = 66;
//   boolean isYoung = (age < 18);
// boolean isOld = (age > 65);
//if (!isYoung && !isOld)
//    System.out.println("Вы можете работать");

//    int  n = 0;
//  while (n < 4)
// {
//   System.out.println("мама");
// n++;
//}

