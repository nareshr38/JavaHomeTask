package com.ranguht.code.javabasics.hometask_collections_1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Iterator;
import java.util.LinkedList;

public class Collection_LinkList {
    private static final Logger logger = LogManager.getLogger(Collection_LinkList.class.getName());
    public static void main(String[] args) {

        LinkedList list =new LinkedList();
        list.add(3);
        list.add(4);
        list.add(4);
        list.add("Naresh");
        list.remove(0);
        Iterator i =list.iterator();

        while(i.hasNext())
        {
            logger.info(i.next());
        }
    }
}