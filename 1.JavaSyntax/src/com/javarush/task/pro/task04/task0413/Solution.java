package com.javarush.task.pro.task04.task0413;

/* 
Рисуем треугольник
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int eightCount = 1 + i;
            for (int l = 0; l < eightCount; l++)
                System.out.print("8");
            System.out.println();
        }
    }
}