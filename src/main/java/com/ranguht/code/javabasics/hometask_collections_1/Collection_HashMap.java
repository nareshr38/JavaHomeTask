package com.ranguht.code.javabasics.hometask_collections_1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Collection_HashMap {
    private static final Logger logger = LogManager.getLogger(Collection_HashMap.class.getName());

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(104, "Vijay");
        map.put(102, "Rahul");
        map.put(103, "Gaurav");
        logger.info("Initial list of elements: " + map);
        map.remove(102);
        logger.info("Updated list of elements: " + map);
        Set<Integer> set = map.keySet();
        Iterator<Integer> i = set.iterator();
        while (i.hasNext()) {
            Integer key = i.next();
            logger.info("keys-->" + key);
            logger.info("value-->" + map.get(key));
        }
    }
}
