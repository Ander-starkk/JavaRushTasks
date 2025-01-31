package com.javarush.task.pro.task02.task0203;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Stack;
/* 
Последняя цифра числа
*/

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();
        char[] chars = path.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '/')
                chars[i] = '\\';

        }
        String result = new String(chars);
        System.out.println(result);
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

