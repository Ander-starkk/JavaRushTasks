package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Иванов Дмитрий", 5.0);
        grades.put("Колесников Алексей", 5.0);
        grades.put("Маркав Николай", 5.0);
        grades.put("Никаноров Иван", 5.0);
        grades.put("Сафронов Пётр", 5.0);

    }
}
