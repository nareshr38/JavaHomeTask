package com.ranguht.code.javabasics.hometask_4;

import java.util.Scanner;

public class DuplicateString {
    public static void main(String[] args) {

        System.out.println("Enter input string");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        int counter = 0;


        for (int firstLetter = 0; firstLetter < inputString.length(); firstLetter++) {
            for (int nextLetter = firstLetter + 1; nextLetter < inputString.length(); nextLetter++) {
                if (inputString.charAt(firstLetter) == inputString.charAt(nextLetter)) {
                    System.out.println("Duplicate characters in a given string are:"+inputString.charAt(nextLetter));
                    counter++;
                }
            }
        }
        if (counter ==0)
        {
            System.out.println("there are no duplicate characters in a given string");
        }
    }
}

