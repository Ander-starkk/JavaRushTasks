package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName1 = scanner.nextLine();
        String fileName2 = scanner.nextLine();
        try (InputStream inputStream = Files.newInputStream(Paths.get(fileName1));
             OutputStream outputStream = Files.newOutputStream(Paths.get(fileName2))) {
            byte[] bytes = inputStream.readAllBytes();
            for (int i = 0; i < bytes.length; i = i + 2) {
                if (i < bytes.length - 1) {
                    byte temp = bytes[i];
                    bytes[i] = bytes[i + 1];
                    bytes[i + 1] = temp;
                }

            }


            outputStream.write(bytes);


        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }

    }
}

