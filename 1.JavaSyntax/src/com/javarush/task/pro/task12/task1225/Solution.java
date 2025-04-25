package com.javarush.task.pro.task12.task1225;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Аккаунт ИнстаМатрицы
*/

public class Solution {

    public static ArrayList<String> accountsList = new ArrayList<>();

    public static void main(String[] args) {
        convertAccounts();
        registerAccount("Амиго");
        registerAccount("Диего");
        accountsList.forEach(System.out::println);
    }

    public static void convertAccounts() {
        accountsList = new ArrayList<>(Arrays.asList(Accounts.getAccounts()));
    }

    public static void registerAccount(String username) {
        if (!accountsList.contains(username)) {
            accountsList.add(username);
        }
        for (String str: accountsList) {
            System.out.println(str);
        }
    }
}