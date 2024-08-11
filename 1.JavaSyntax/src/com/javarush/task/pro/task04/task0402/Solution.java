package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        int i = 0;
        String s = " Любит меня";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        while (i < 10) {
            System.out.println(name + s);
            i++;
        }
    }
}
