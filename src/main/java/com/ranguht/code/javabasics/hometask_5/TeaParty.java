package com.ranguht.code.javabasics.hometask_5;

import java.util.Scanner;

public class TeaParty {
    /*static int tea;
    static int candy;

    public static void main(String[] args) {
        System.out.println("Enter the integer number for tea : ");
        Scanner s = new Scanner(System.in);
        tea = s.nextInt();

        System.out.println("Enter the integer number for candy: ");
        candy = s.nextInt();

        int PartyResult = partyDescription(tea, candy);
        System.out.println(PartyResult);

    }*/

    public static int partyDescription(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        } else if ((tea >= 2 * candy) || (candy >= 2 * tea)) {
            return 2;
        } else {
            return 1;
        }
    }
}