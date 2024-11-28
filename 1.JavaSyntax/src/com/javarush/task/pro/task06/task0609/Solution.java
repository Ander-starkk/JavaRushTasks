package com.javarush.task.pro.task06.task0609;

/* 
Кубический калькулятор в кубе
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long value = scanner.nextLong();
        long valueNine = ninthDegree(value);
        System.out.println(valueNine);
    }

    public static long cube(long a) {
        return a * a * a;
    }

    public static long ninthDegree(long a) {


        return cube(cube(a));

    }
}
