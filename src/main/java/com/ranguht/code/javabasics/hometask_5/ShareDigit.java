package com.ranguht.code.javabasics.hometask_5;

import java.util.Scanner;

public class ShareDigit {
   /* static int a, b;

    public static void main(String[] args) {

        System.out.println("Enter the integer number for a : ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();

        System.out.println("Enter the integer number for b : ");
        b = s.nextInt();
        Boolean DigitResult = Digit(a, b);
        System.out.println(DigitResult);

    }*/

    public static boolean Digit(int a, int b) {

        if ((a / 10 == b / 10) || (a / 10 == b % 10) || (a % 10 == b / 10) || (a % 10 == b % 10)) {
            return true;
        } else {
            return false;
        }
    }
}