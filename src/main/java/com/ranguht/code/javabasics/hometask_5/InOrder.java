package com.ranguht.code.javabasics.hometask_5;

import java.util.Scanner;

public class InOrder {
    /*static int a, b, c;
    static boolean bool = true;

    public static void main(String[] args) {
        System.out.println("Enter the integer number for a : ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        System.out.println("Enter the integer number for b: ");
        b = s.nextInt();
        System.out.println("Enter the integer number for c: ");
        c = s.nextInt();
        System.out.println("Enter the boolean value: ");
        bool = s.nextBoolean();
        boolean OrderResult = Order(a, b, c, bool);
        System.out.println(OrderResult);

    }
*/
    public static boolean Order(int a, int b, int c, boolean bool) {

        if (bool == true && c > b)
            return true;
        else if (b > a && c > b)
            return true;
        else
            return false;


    }
}
