package com.ranguht.code.javabasics.hometaskcollections1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class CollectionArrayList {
    private static final Logger logger = LogManager.getLogger(CollectionArrayList.class.getName());

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove(0);
        for (int j = 0; j < list.size(); j++) {
            logger.info(list.get(j));
        }
    }
}


