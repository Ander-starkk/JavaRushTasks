package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);
        int per1 = hello.nextInt();
        int per2 = hello.nextInt();
        int per3 = hello.nextInt();

        if (((per1 + per2) <= per3) || ((per2 + per3) <= per1) || ((per1 + per3) <= per2)) {
            System.out.println(TRIANGLE_NOT_EXISTS);
        } else {
            System.out.println(TRIANGLE_EXISTS);
        }
    }
}
