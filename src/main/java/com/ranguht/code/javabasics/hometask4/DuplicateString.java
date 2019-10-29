package com.ranguht.code.javabasics.hometask4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class DuplicateString {
    private static final Logger logger = LogManager.getLogger(DuplicateString.class.getName());
    public static void main(String[] args) {

        logger.info("Enter input string");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        int counter = 0;


        for (int firstLetter = 0; firstLetter < inputString.length(); firstLetter++) {
            for (int nextLetter = firstLetter + 1; nextLetter < inputString.length(); nextLetter++) {
                if (inputString.charAt(firstLetter) == inputString.charAt(nextLetter)) {
                    logger.info("Duplicate characters in a given string are:"+inputString.charAt(nextLetter));
                    counter++;
                }
            }
        }
        if (counter ==0)
        {
            logger.info("there are no duplicate characters in a given string");
        }
    }
}

