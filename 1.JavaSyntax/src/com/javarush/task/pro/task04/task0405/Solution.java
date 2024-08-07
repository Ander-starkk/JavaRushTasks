package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int stroka1 = 0;
        while (stroka1 < 5) {
            int stolbec1 =0;
            while (stolbec1 < 20) {
                System.out.print("Б");
                stolbec1++;
            }
            System.out.println("Б            Б");
            stroka1++;
        }
    }
}