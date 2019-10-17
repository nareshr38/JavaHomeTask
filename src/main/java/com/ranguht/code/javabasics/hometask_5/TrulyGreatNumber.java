package com.ranguht.code.javabasics.hometask_5;

import java.util.Scanner;

public class TrulyGreatNumber {
    /*public static void main(String[] args) {
        System.out.println("Enter the integer number for a : ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        System.out.println("Enter the integer number for b: ");
        int b = s.nextInt();
        boolean GreatNumberResult = GreatNumber(a, b);
        System.out.println(GreatNumberResult);

    }*/

    public static boolean GreatNumber(int a, int b) {
        if (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6)
            return true;

        return false;
    }
}