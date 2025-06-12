package com.javarush.task.pro.task02.task0201;

/* 
«Я по объявлению…»
*/

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Thread.sleep;

public class DayOfWeek {

    //метод, который распечатывает все оценки
    public static void printAllGrades(int[] grades) {
        System.out.print("|");
        for (int num : grades) {

            System.out.print(num + "|");
        }
        System.out.println();
    }

//метод, в котором выводится средняя оценка

    public static double midGrade(int[] numbers) {
        int grade = 0;

        for (int num : numbers) {
            grade = num + grade;
        }
        double doubleSr = (double) grade / numbers.length;
        return doubleSr;

    }
    //метод в котором вычисляется лучшая (максимальная) оценка
    public static int bestGrade(int[] numbers) {
        int maxGrade = numbers[0];

        for (int num : numbers) {
            if (num > maxGrade) {
                maxGrade = num;
            }
        }
        return maxGrade;
    }

    public static void main(String[] args) {

//массив оценок
        int[] grades = {5, 10, 7, 8, 9, 9, 10, 12};


        int highest_marks = bestGrade(grades);
        double average_marks = midGrade(grades);
        System.out.print("All the grades: ");
        printAllGrades(grades);
        System.out.println("The highest grade is " + highest_marks);
        System.out.println("The average grade is " + average_marks);
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
