package com.javarush.task.pro.task06.task0606;

/* 
Универсальный солдат
*/

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        universalMethod();

        int i = 4;
        int value = 6;
        universalMethod(i, value);

        String str = "hello";
        String str2 = "privet";
        universalMethod(str, str2);

        double h = 3.15;
        int j = 34;
        universalMethod(h,j);

        int x = 46;
        double fg = 5.453453;
        int cen = 43;
        universalMethod(x, fg, cen);

        short k = 23;
        int jer = 2342;
        universalMethod(k, jer);

        double q = 43.352;
        double ds = 34234.34342;
        universalMethod(q, ds);

       int[] array = {1, 32, 24, 234, 43};
        universalMethod(array);

        int e = 34;
        int y = 454;
        int f = 4546;
        universalMethod(e, y, f);

        double m = 83.34;
        double b = 2424.23;
        double g = 2424.2342;
        universalMethod(m, b, g);
    }

    public static void universalMethod() {

    }

    public static void universalMethod(int i, int value) {
        System.out.println(i + value);
    }

    public static void universalMethod(String str, String value) {
        System.out.println(str + value);
    }

    public static void universalMethod(double i, int value) {
        System.out.println(i + value);
    }

    public static void universalMethod(int array, double value, int x) {
        System.out.println(array + value + x);
    }

    public static void universalMethod(short i, int value) {
        System.out.println(i + value);
    }

    public static void universalMethod(double i, double value) {
        System.out.println(i + value);
    }

    public static void universalMethod(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void universalMethod(int i, int value, int b) {
        System.out.println(i + value + b);
    }

    public static void universalMethod(double i, double value, double h) {
        System.out.println(i + value + h);
    }
}
