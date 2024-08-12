package com.javarush.task.pro.task02.task0203;

import java.util.Scanner;
/* 
Последняя цифра числа
*/

public class Solution {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 20) {
            i++;
            if ((i % 7) == 0)
                continue;
            System.out.println(i);
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

