package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String m = scanner.nextLine();
        String s = " Любит меня";
        int n = 0;
        while (n < 10) {
            System.out.println(m + s);
            n++;
        }
    }

}
