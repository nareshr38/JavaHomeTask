package com.ranguht.code.javabasics.hometask2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculate {
    private static final Logger LOGGER = LogManager.getLogger(Calculate.class.getName());
    public static void main(String[] args) {

        double firstNumber = Double.parseDouble(args[0]);
        double secondNumber = Double.parseDouble(args[1]);
        String operation = args[2];

        if (operation.equals("+")) {
            LOGGER.info("Addition : " + (firstNumber + secondNumber));
        } else if (operation.equals("-")) {
            LOGGER.info("Subtraction :" + (firstNumber - secondNumber));
        } else if (operation.equals("*")) {
            LOGGER.info("Multiplication :" + firstNumber * secondNumber);
        } else if (operation.equals("/")) {
            LOGGER.info("Division :" + (firstNumber / secondNumber));
        } else if (operation.equals("%")) {
            LOGGER.info("Remainder :" + (firstNumber % secondNumber));
        } else {
            LOGGER.info("percentage:" + (firstNumber / secondNumber) * 100);
        }
    }
}