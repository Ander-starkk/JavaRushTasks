package com.javarush.task.pro.task02.task0203;

import java.util.Scanner;
/* 
Последняя цифра числа
*/

public class Solution {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int startCount = 10 - i;
            for (int j = 0; j < startCount; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
//     int age = 66;
//   boolean isYoung = (age < 18);
// boolean isOld = (age > 65);
//if (!isYoung && !isOld)
//    System.out.println("Вы можете работать");

//    int  n = 0;
//  while (n < 4)
// {
//   System.out.println("мама");
// n++;
//}

