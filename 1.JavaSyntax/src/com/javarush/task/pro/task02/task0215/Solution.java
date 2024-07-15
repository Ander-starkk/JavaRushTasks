package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
    Scanner chislo1 = new Scanner(System.in);
    int vvod1 = chislo1.nextInt();
    Scanner chislo2 = new Scanner(System.in);
    int vvod2 = chislo2.nextInt();
    Scanner chislo3 = new Scanner(System.in);
    int vvod3 = chislo3.nextInt();

    System.out.println((vvod1+vvod2+vvod3)/3);
    }
}
