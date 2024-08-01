package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int stroka = 0;
        while (stroka < 5) {
            int stolbec = 0;
            while (stolbec < 10) {
                System.out.print("Q");
                stolbec++;
            }
            System.out.println();
            stroka++;
        }
    }
}