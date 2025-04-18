package com.javarush.task.pro.task12.task1209;

import java.util.ArrayList;

/* 
Бухгалтерия
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        if (name == null) {
            return;
        }
        for (int i = 0; i < waitingEmployees.size(); i++) {
            if (name.equals(waitingEmployees.get(i))) {
                alreadyGotSalaryEmployees.add(name);
                waitingEmployees.set(i, null);
            }
        }
        if (waitingEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);
            int i = waitingEmployees.indexOf(name);
            waitingEmployees.set(i, null);
        }
    }
}
