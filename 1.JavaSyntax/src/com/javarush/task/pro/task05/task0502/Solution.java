package com.javarush.task.pro.task05.task0502;

/* 
Четные и нечетные ячейки массива
*/

public class Solution {
    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] strings = new String[5];

    public static void main(String[] args) {
        for (int i = 0; i < strings.length; i++) {
      //      if (strings[i % 2 == 0]) {
      //          strings[i] = EVEN;
                if (i % 2 == 0) {
                    strings[i] = EVEN;
                } else {
                    strings[i] = ODD;
            }
        }
   //             strings[0] = EVEN;
   //     strings[1] = ODD;
   //     strings[2] = EVEN;
   //     strings[3] = ODD;
   //     strings[4] = EVEN;

        System.out.print("index = 0");
        System.out.println(" value = " + strings[0]);
        System.out.print("index = 1");
        System.out.println(" value = " + strings[1]);
        System.out.print("index = 2");
        System.out.println(" value = " + strings[2]);
        System.out.print("index = 3");
        System.out.println(" value = " + strings[3]);
        System.out.print("index = 4");
        System.out.println(" value = " + strings[4]);
    }
}