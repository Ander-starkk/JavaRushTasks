package com.javarush.task.pro.task02.task0201;

/* 
«Я по объявлению…»
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        final double threshold = 0.0001;

        double f1 = 0.0;
        for (int i = 1; i <= 11; i++) {
            f1 += .1;
        }

        double f2 = 0.1 * 11;
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        if (Math.abs(f1-f2)<threshold)
            System.out.println("f1 и f2 равны!");
        else
            System.out.println("f1 и f2 не равны!");
    }
}
//  int intValue = 5, numericValue = intValue + 10, size = intValue + numericValue, number = numericValue + 20
//  public static void main(String[] args)  {

// while (true) {
//   int x = System.in.read();
//    System.out.println(x);
//   }
//}
//}
