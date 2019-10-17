package com.ranguht.code.javabasics.hometask_collections_1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Iterator;
import java.util.TreeSet;

public class Collection_TreeSet {
    private static final Logger logger = LogManager.getLogger(Collection_TreeSet.class.getName());

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            logger.info(itr.next());
        }
    }
}