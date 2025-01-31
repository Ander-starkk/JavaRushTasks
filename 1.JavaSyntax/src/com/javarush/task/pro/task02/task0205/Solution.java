package com.javarush.task.pro.task02.task0205;

/* 
Когда-то было 32 зуба
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();

        if (path.endsWith(".jpg") || path.endsWith(".jpeg"))
        {
            System.out.println("Это Jpeg!");
        }
        else if (path.endsWith(".htm") || path.endsWith(".html"))
        {
            System.out.println("Это HTML-страница");
        }
        else if (path.endsWith(".doc") || path.endsWith(".docx"))
        {
            System.out.println("Это документ Word");
        }
        else
        {
            System.out.println("Неизвестный формат");
        }
    }
}
