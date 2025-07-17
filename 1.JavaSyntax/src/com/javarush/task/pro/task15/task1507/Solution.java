package com.javarush.task.pro.task15.task1507;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        InputStream inputStream = Files.newInputStream(Paths.get(filename));
        InputStreamReader reader = new InputStreamReader(inputStream);
        BufferedReader buff = new BufferedReader(reader);
        System.out.println(inputStream);
        System.out.println(buff);
    }
}

