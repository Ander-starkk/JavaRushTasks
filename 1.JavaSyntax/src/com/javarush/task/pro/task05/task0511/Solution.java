package com.javarush.task.pro.task05.task0511;

import java.util.Arrays;
import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        multiArray = new int[number][];
        for (int i = 0; i < multiArray.length; i++) {
            int number2 = scanner.nextInt();
            int[] array = new int[number2];
            multiArray[i] = array;
        }
        System.out.println(Arrays.deepToString(multiArray));
    }

}