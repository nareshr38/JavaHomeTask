package com.ranguht.code.javabasics.hometaskcollections1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class CollectionTreeMap {
    private static final Logger logger = LogManager.getLogger(CollectionTreeMap.class.getName());

    public static void main(String[] args) {
        TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
        tmap.put(100, "Amit");
        tmap.put(104, "Vijay");
        tmap.put(102, "Rahul");
        tmap.put(103, "Gaurav");
        logger.info("Initial list of elements: " + tmap);
        tmap.remove(103);
        logger.info("Updated list of elements: " +tmap);
        Set<Integer> set = tmap.keySet();
        Iterator<Integer> i = set.iterator();
        while (i.hasNext()) {
            Integer key = i.next();
            logger.info("keys-->" + key);
            logger.info("value-->" + tmap.get(key));
        }
    }
}
