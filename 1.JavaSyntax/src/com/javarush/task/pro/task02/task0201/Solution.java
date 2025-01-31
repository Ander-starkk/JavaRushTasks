package com.javarush.task.pro.task02.task0201;

/* 
«Я по объявлению…»
*/

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Thread.sleep;

public class Solution {
    String model;
    int maxSpeed;

    public Solution(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    public static void main(String[] args) {
        Solution bugatti = new Solution("Bugatti Veyron", 407);
        System.out.println(bugatti.model);
        System.out.println(bugatti.maxSpeed);
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
