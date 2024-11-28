package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long value = cube(scanner.nextLong());
        System.out.println(value);
    }

    public static long cube(long value) {
        return value * value * value;
    }
}
