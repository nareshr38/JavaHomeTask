package com.ranguht.code.javabasics.loggingtask;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LevelsOfLogging {

    private static final Logger LOGGER = LogManager.getLogger(LevelsOfLogging.class.getName());

    public static void main(String[] args) {
        LOGGER.debug("Debug Message Logged !!!");
        LOGGER.info("Info Message Logged !!!");
        LOGGER.error("Error Message Logged !!!");
        LOGGER.warn("Warn message Logged!!!");
        LOGGER.fatal("Fatal message Logged!!!");

    }
}
