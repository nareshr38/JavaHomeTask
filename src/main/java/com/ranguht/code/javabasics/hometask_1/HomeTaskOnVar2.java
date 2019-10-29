package com.ranguht.code.javabasics.hometask_1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class HomeTaskOnVar2 {
    private static final Logger LOGGER = LogManager.getLogger(HomeTaskOnVar2.class.getName());
    public static void main(String[] args) {
        double daniel;
        double amber;
        LOGGER.info("Enter the number of apples daniel have : ");
        Scanner s = new Scanner(System.in);
        daniel = s.nextDouble();

        LOGGER.info("Enter the double for Amber: ");
        amber = s.nextDouble();

        double totalNumberOfApples = applesCount(daniel, amber);

        LOGGER.info("total number of apples both daniel and amber had :" + totalNumberOfApples);
    }

    public static double applesCount(double daniel, double amber) {
        return daniel + amber;
    }
}