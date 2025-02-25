package com.javarush.task.pro.task02.task0201;

/* 
«Я по объявлению…»
*/

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Thread.sleep;

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    public static void main(String[] args) throws Throwable {

        for (int i = 0 ; i < 1000000; i++) {

            Cat cat = new Cat();
            cat = null;//вот здесь первый объект становится доступен сборщику мусора
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Объект Cat уничтожен!");
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
