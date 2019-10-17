package com.ranguht.code.javabasics.hometask_5;

import java.util.Scanner;

public class BlueLotteryTicket {
  /*  static int a, b, c;

    public static void main(String[] args) {

        System.out.println("Enter the integer number for a : ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        System.out.println("Enter the integer number for b : ");
        b = s.nextInt();
        System.out.println("Enter the integer number for c : ");
        c = s.nextInt();;
        int ticketResult = blueTicket(a, b, c);
        System.out.println(ticketResult);

    }*/


    public static int blueTicket(int a, int b, int c) {

        if (a + b == 10 || b + c == 10 || c + a == 10)
            return 10;
        else if ((a + b >= b + c + 10) || (a + b >= c + a + 10))
            return 5;
        else
            return 0;


    }
}