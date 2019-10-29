package com.ranguht.code.javabasics.hometask4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Rotation {
    private static final Logger logger = LogManager.getLogger(Rotation.class.getName());

    public static void main(String[] args) {

        logger.info("Enter first input string ");
        Scanner sc = new Scanner(System.in);
        String firstString = sc.nextLine();
        logger.info("Enter second input string");
        String secondString = sc.nextLine();
        if (areRotations(firstString, secondString))
            logger.info("Strings are rotations of each other");
        else
            logger.info("Strings are not rotations of each other");
    }

    static boolean areRotations(String firstString, String secondString) {

        return (firstString.length() == secondString.length()) &&
                ((firstString + firstString).indexOf(secondString) != -1);
    }


}