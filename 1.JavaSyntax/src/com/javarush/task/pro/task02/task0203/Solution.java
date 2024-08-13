package com.javarush.task.pro.task02.task0203;

import java.util.Scanner;
/* 
Последняя цифра числа
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (scanner.hasNextInt()) {
            int l = scanner.nextInt();
            if (l > max)
                max = l;
            }
            System.out.println(max);
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

