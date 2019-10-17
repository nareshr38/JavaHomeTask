package com.ranguht.code.javabasics.hometask_5;

import java.util.Scanner;

public class MaxBlock {
    /*static String blockOfString;

    public static void main(String[] args) {
        System.out.println("Enter input string with repetetion");
        Scanner sc = new Scanner(System.in);
        String blockOfString = sc.nextLine();
        int MaxBlockResult = maxCharInAString(blockOfString);
        System.out.println(MaxBlockResult);
    }*/

    public static int maxCharInAString(String blockOfString) {
        int maxCounter = 1;
        int counter = 1;
        if (blockOfString.isEmpty()) {
            return 0;
        }
        for (int index = 1; index < blockOfString.length(); index++) {
            if (blockOfString.charAt(index - 1) == blockOfString.charAt(index)) {
                counter = counter + 1;
                if (counter > maxCounter) {
                    maxCounter = counter;
                }
            } else {
                counter = 1;
            }
        }

        return maxCounter;
    }

}