package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);

        int vvod1 = hello.nextInt();
        int vvod2 = hello.nextInt();
        int vvod3 = hello.nextInt();

        if (((vvod1 == vvod2) && (vvod2 == vvod3))) {
            System.out.println(vvod1 + " " + vvod2 + " " + vvod3);
        } else if (vvod1 == vvod2) {
            System.out.println(vvod1 + " " + vvod2);
        }else if (vvod2 == vvod3) {
            System.out.println(vvod2 + " " + vvod3);
        }else if (vvod1 == vvod3) {
            System.out.println(vvod1 + " " + vvod3);
        }
    }

}

// if (vvod1 == vvod2 == vvod3)
//   System.out.println(vvod1 + " " + vvod2  + vvod3);
// boolean chet = vvod1 == vvod2 == vvod3;
// boolean  chet2 = vvod1 == vvod2;
// boolean chet3 = vvod2 == vvod3;
// if (chet) {
//     System.out.println(vvod1 + vvod2 + vvod3);
//} if else (chet2) {
//              System.out.println(vvod1 + vvod2);
//    } if else (chet3) {
//    System.out.println(vvod3+vvod2);
// }}
// if (vvod1==vvod2==vvod3) {
//    System.out.println(vvod1);
//}
// if (vvod1==vvod2)
//     System.out.println(vvod2);
//  if (vvod2==vvod3)
//      System.out.println(vvod2);


