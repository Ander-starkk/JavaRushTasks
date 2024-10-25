package com.javarush.task.pro.task05.task0501;
import java.util.Scanner;
/* 
Создаем массивы
*/

public class Solution {
    public static void main(String[] args) {
        String[] array = new String[10];

        array[1] = "textbezkodas";
        array[2] = array[1];
        array[3] = new String("Привет");
// сравниваем
        System.out.println(array[2]);
    }
}
