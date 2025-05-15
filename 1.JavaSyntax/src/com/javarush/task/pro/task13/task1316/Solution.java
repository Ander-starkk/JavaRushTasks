package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest[] languages = JavarushQuest.values();

        for (JavarushQuest language: languages) {
            System.out.println(language.ordinal());
        }

    }
}
