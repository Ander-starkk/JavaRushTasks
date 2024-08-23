package com.javarush.task.pro.task02.task0203;

import java.math.BigDecimal;
import java.util.Scanner;
/* 
Последняя цифра числа
*/

public class Solution {

    public static void main(String[] args) {
        BigDecimal f1 = new BigDecimal(0.0);
        BigDecimal pointOne = new BigDecimal(0.1);

        for (int i = 1; i <= 11; i++) {
            f1 = f1.add(pointOne);
        }

        BigDecimal f2 = new BigDecimal(0.1);
        BigDecimal eleven = new BigDecimal(11);
        f2 = f2.multiply(eleven);

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        if (f1.compareTo(f2) == 0)
            System.out.println("f1 и f2 равны!");
        else
            System.out.println("f1 и f2 не равны!");
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

