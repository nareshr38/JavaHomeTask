package com.ranguht.code.javabasics.hometask4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class MissingNumber {

    private static final Logger logger = LogManager.getLogger(MissingNumber.class.getName());

    public static void main(String[] args) {
        StringBuilder pattern = new StringBuilder("\n");
        int limit = 100;
        logger.info("Please enter array numbers");
        Scanner input = new Scanner(System.in);
        int[] inputArray = new int[5];

        for (int index = 0; index < inputArray.length; index++) {

            inputArray[index] = input.nextInt();
        }

        boolean isPresent = true;
        for (int jIndex = 0; jIndex <= limit; jIndex++) {
            for (int number : inputArray) {
                if (number == jIndex) {
                    isPresent = false;
                }
            }
            if (isPresent) {
                pattern = pattern.append(jIndex + " ");

            }

            isPresent = true;
        }
        logger.info(pattern);
    }
}
