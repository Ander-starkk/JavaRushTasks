package com.javarush.task.pro.task02.task0201;

/* 
«Я по объявлению…»
*/

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int[] months = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10, 11, 12};
        fill(months, -1, 10, 8);
        System.out.println(Arrays.toString(months));
    }

    public static void fill(int[] data, int from, int to, int value)
    {


        if (from < 0 || to > data.length)
            return;

        for (int i = from; i < to; i++)
        {
            data[i] = value;
        }
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
