package com.javarush.task.pro.task02.task0203;

import java.util.Scanner;
/* 
Последняя цифра числа
*/

public class Solution {

    public static void main(String[] args) {
        int age = 66;
        boolean isYoung = (age < 18);
        boolean isOld = (age > 65);
        if (!isYoung && !isOld)
            System.out.println("Вы можете работать");
    }
}