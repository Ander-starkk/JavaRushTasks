package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cocaCola = scanner.nextInt();
        int countPeople = scanner.nextInt();
        System.out.println(cocaCola*1.0/countPeople);

    }
}