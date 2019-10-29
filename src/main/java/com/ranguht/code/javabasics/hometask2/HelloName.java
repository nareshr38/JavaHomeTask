package com.ranguht.code.javabasics.hometask2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloName{
        private static final Logger LOGGER = LogManager.getLogger(HelloName.class.getName());

    public static void main(String[] args)
    {
        for (int i = 0; i < args.length; i++)
        {
            LOGGER.info("Hello" + " " + args[i]);
        }
    }
}
