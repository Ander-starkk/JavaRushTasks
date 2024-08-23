package com.javarush.task.pro.task02.task0205;

/* 
Когда-то было 32 зуба
*/

public class Solution {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
        {
            int starCount = 10 - i;
            for (int j = 0; j < starCount; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
