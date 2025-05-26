package com.javarush.task.pro.task02.task0201;

/* 
«Я по объявлению…»
*/

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Thread.sleep;

public class DayOfWeek {

    private String title;

    public DayOfWeek(String title) {
        this.title = title;
    }

    public static void main(String[] args) {
        DayOfWeek dayOfWeek = new DayOfWeek("Суббота");
        System.out.println(dayOfWeek);
    }

    @Override
    public String toString() {
        return "DayOfWeek{" +
                "title='" + title + '\'' +
                '}';
    }
}

//  int intValue = 5, numericValue = intValue + 10, size = intValue + numericValue, number = numericValue + 20
//  public static void main(String[] args)  {

// while (true) {
//   int x = System.in.read();
//    System.out.println(x);
//   }
//}
//}
