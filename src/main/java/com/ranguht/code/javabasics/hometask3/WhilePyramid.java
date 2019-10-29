package com.ranguht.code.javabasics.hometask3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class WhilePyramid {
    private static final Logger logger = LogManager.getLogger(WhilePyramid.class.getName());
    static int counter = 0;

    public static void main(String[] args) {


        logger.info("Enter the integer number for pyramid height : ");
        Scanner s = new Scanner(System.in);
        int numberForPyramidHt = s.nextInt();

        logger.info("Enter the integer for difference to be displayed on pyramid: ");
        int differenceToBeDisplayedOnPyramid = s.nextInt();

        pyramidWhile(numberForPyramidHt, differenceToBeDisplayedOnPyramid);

    }

    public static void pyramidWhile(int numberForPyramidHt, int differenceToBeDisplayedOnPyramid) {
        StringBuilder pattern = new StringBuilder("\n");
        int rowNumber = 0;
        while (rowNumber < numberForPyramidHt) {
            int columnNumber = 0;

            while (columnNumber < rowNumber + 1) {
                pattern = pattern.append(counter + " ");
                counter = counter + differenceToBeDisplayedOnPyramid;
                columnNumber++;
            }
            rowNumber++;
            pattern = pattern.append("\n");
        }
        logger.info(pattern);
    }
}