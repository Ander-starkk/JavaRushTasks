package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        Scanner name = new Scanner(System.in);
        String vvod4 = name.next();
        Scanner vozrast = new Scanner(System.in);
        int vvod5 = vozrast.nextInt();

        {
            if (vvod5 >= 18)
                    if (vvod5 <= 28)
                System.out.println(vvod4 + militaryCommissar);
        }
    }
}
