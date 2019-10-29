package com.ranguht.code.javabasics.hometask_4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class MaxAndMin {
    private static final Logger logger = LogManager.getLogger(MaxAndMin.class.getName());

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            logger.info("Please enter array numbers");
            array[i] = input.nextInt();
        }

        int max = getMax(array);
        logger.info("Maximum Value is: " + max);

        int min = getMin(array);
        logger.info("Minimum Value is: " + min);
    }


    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }


    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}
