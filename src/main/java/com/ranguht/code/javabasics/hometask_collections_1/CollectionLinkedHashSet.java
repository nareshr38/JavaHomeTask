package com.ranguht.code.javabasics.hometask_collections_1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;


public class CollectionLinkedHashSet {
    private static final Logger logger = LogManager.getLogger(CollectionLinkedHashSet.class.getName());
    public static void main(String[] args) {
        LinkedHashSet list = new LinkedHashSet();
        list.add("Naresh");
        list.add("Rangu");
        list.add(1);
        Iterator i =list.iterator();
        while(i.hasNext())
        {
            logger.info(i.next());
        }
    }
}