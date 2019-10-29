package com.ranguht.code.javabasics.hometask3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class ForPyramid {

    private static final Logger logger = LogManager.getLogger(ForPyramid.class.getName());
    static int counter = 0;
    static int differenceToBeDisplayedOnPyramid = 0;


    public static void main(String[] args) {


        logger.info("Enter the integer number for pyramid height : ");
        Scanner s = new Scanner(System.in);
        int numberForPyramidHt = s.nextInt();

        logger.info("Enter the integer for difference to be displayed on pyramid: ");
        int differenceToBeDisplayedOnPyramid = s.nextInt();

        pyramidFor(numberForPyramidHt, differenceToBeDisplayedOnPyramid);
    }

    public static void pyramidFor(int pyramidHeight, int differenceToBeDisplayedOnPyramid) {
        StringBuilder pattern = new StringBuilder("\n");
        for (int rowNumber = 0; rowNumber < pyramidHeight; rowNumber++) {

            for (int columnNumber = 0; columnNumber < rowNumber + 1; columnNumber++) {
                pattern = pattern.append(counter + " ");
                counter = counter + differenceToBeDisplayedOnPyramid;
            }
            pattern = pattern.append("\n");
        }
        logger.info(pattern);
    }
}