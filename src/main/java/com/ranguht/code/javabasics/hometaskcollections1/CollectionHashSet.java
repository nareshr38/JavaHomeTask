package com.ranguht.code.javabasics.hometaskcollections1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionHashSet {
    private static final Logger logger = LogManager.getLogger(CollectionHashSet.class.getName());
    public static void main(String[] args) {

        HashSet list=new HashSet();
        list.add(3);
        list.add(1);
        list.add(8);
        Iterator i =list.iterator();
        while(i.hasNext())
        {
            logger.info(i.next());
        }

    }
}
