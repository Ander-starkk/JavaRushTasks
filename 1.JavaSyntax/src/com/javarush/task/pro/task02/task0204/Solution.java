package com.javarush.task.pro.task02.task0204;

/* 
9-ка это перевернутая 6-ка
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();

        String[] array = path.split("/");
        String result = String.join("\\", array);

        System.out.println(result);

    }
}
