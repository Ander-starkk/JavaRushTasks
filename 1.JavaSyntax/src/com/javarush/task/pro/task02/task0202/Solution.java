package com.javarush.task.pro.task02.task0202;

/* 
Полнометражная картина
*/
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20)
        {
            if ( (i % 7) == 0 )
                continue;
            System.out.println(i);
            i++;
        }

    }
}
    //int age = 60;
    //boolean test = (age>65);
    //if (test)
      //  System.out.println("Пора на пенсию");
        //    Scanner console = new Scanner(System.in);  // создаем объект Scanner
       // int a = console.nextInt();  // читаем с клавиатуры первое число
        //int b = console.nextInt();  // читаем с клавиатуры второе число
        //if (a < b)                   // если a меньше b
          //  System.out.println(a);     // выводим на экран a
        //else                         // иначе
          //  System.out.println(b);     // выводим на экран b
      //  int centimeters = 243;

        //int meters = centimeters / 100;

        //System.out.println(meters);

