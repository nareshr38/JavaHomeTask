package com.ranguht.code.javabasics.hometask_5;

import java.util.Scanner;

public class SumLimit {
    /*public static void main(String[] args) {

        System.out.println("Enter the integer number for a : ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        System.out.println("Enter the integer number for b : ");
        int b = s.nextInt();

        int LimitResult = sumLimitCompare(a, b);
        System.out.println(LimitResult);
        }*/


    public static int sumLimitCompare(int a, int b) {
        int sum = a + b;
        int aLength = String.valueOf(a).length();
        int sumLength = String.valueOf(sum).length();

        if (sumLength == aLength)
            return sum;

        return a;
    }

}