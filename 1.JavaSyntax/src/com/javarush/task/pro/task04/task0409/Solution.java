package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/*
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while (scanner.hasNextInt()) {
            int l = scanner.nextInt();
            if (l < min) {
                min = l;
            }
            System.out.println(min);
        }
    }
}