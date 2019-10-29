package com.ranguht.code.javabasics.hometask_3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class DoWhilePyramid {

    private static final Logger logger = LogManager.getLogger(DoWhilePyramid.class.getName());
    static int counter = 0;

    public static void main(String[] args) {

        logger.info("Enter the integer number for pyramid height: ");
        Scanner s = new Scanner(System.in);
        int numberForPyramidHt = s.nextInt();

        logger.info("Enter the integer for difference to be displayed on pyramid : ");
        int differenceToBeDisplayedOnPyramid = s.nextInt();

        pyramidDoWhile(numberForPyramidHt, differenceToBeDisplayedOnPyramid);

    }

    public static void pyramidDoWhile(int numberForPyramidHt, int differenceToBeDisplayedOnPyramid) {


        int rowNumber = 0;
        int counter = 0;

        StringBuilder pattern = new StringBuilder("\n");
        do {
            int columnNumber = 0;
            do {
                pattern = pattern.append(counter + " ");
                counter = counter + differenceToBeDisplayedOnPyramid;
                columnNumber++;
            } while (columnNumber < rowNumber + 1);
            pattern = pattern.append("\n");

            rowNumber++;

        } while (rowNumber < numberForPyramidHt);

        logger.info(pattern);
    }

}
