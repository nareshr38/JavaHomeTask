package com.ranguht.code.javabasics.hometaskcollections1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class CollectionLinkedHashMap {
    private static final Logger logger = LogManager.getLogger(CollectionLinkedHashMap.class.getName());

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();
        lmap.put(100, "Amit");
        lmap.put(104, "Vijay");
        lmap.put(102, "Rahul");
        lmap.put(103, "Gaurav");
        logger.info("Initial list of elements: " + lmap);
        lmap.remove(103);
        logger.info("Updated list of elements: " +lmap);
        Set<Integer> set = lmap.keySet();
        Iterator<Integer> i = set.iterator();
        while (i.hasNext()) {
            Integer key = i.next();
            logger.info("keys-->" + key);
            logger.info("value-->" + lmap.get(key));
        }
    }
}