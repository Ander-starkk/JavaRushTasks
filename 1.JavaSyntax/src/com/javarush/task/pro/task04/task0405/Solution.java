package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int vysota = 0;
        while (vysota < 10) {
            int shirina = 0;
            while (shirina < 20) {
                if (vysota == 0 || vysota == 9) {
                    System.out.print("Б");
                } else if (shirina == 0 || shirina == 19) {
                    System.out.print("Б");
                } else {
                    System.out.print(' ');
                }
                shirina++;
            }
            System.out.println();
            vysota++;
        }
    }
}