package com.ranguht.code.javabasics.hometask_4;

import java.util.Scanner;

public class Rotation {

    public static void main(String[] args) {

        System.out.println("Enter first input string ");
        Scanner sc = new Scanner(System.in);
        String firstString = sc.nextLine();
        System.out.println("Enter second input string");
        String secondString = sc.nextLine();

        /*String str1 = "AACD";
        String str2 = "ACDA";*/

        if (areRotations(firstString, secondString))
            System.out.println("Strings are rotations of each other");
        else
            System.out.println("Strings are not rotations of each other");
    }

    static boolean areRotations(String firstString, String secondString) {

        return (firstString.length() == secondString.length()) &&
                ((firstString + firstString).indexOf(secondString) != -1);
    }


}