package com.ranguht.code.javabasics.hometask_1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class HomeTaskOnVar {
    private static final Logger LOGGER = LogManager.getLogger(HomeTaskOnVar.class.getName());
    public static void main(String[] args) {
        int daniel;
        int amber;
        LOGGER.info("Enter the number of apples daniel have : ");
        Scanner s = new Scanner(System.in);
        daniel = s.nextInt();

        LOGGER.info("Enter the number of apples amber have : ");
        amber = s.nextInt();

        int totalNumberOfApples = applesCount(daniel, amber);

        LOGGER.info("total number of apples both daniel and amber had :" + totalNumberOfApples);
    }

    public static int applesCount(int daniel, int amber) {

        return daniel+amber;
    }

}
