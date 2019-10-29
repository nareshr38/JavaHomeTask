package com.ranguht.code.javabasics.hometask66;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Iterator;
import java.util.LinkedList;

public class Collections66 {
    private static final Logger logger = LogManager.getLogger(Collections66.class.getName());

    public static void main(String args[]) {

        Collections66 arr = new Collections66();
        arr.printArray();


    }

    public void printArray() {

        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        LinkedList<Integer> integerList = new LinkedList<Integer>();
        logger.info("List of integer array elements");

        for (int i : integerArray) {
            integerList.add(i);
        }
        Iterator i = integerList.iterator();
        while (i.hasNext()) {
            logger.info(i.next());
        }

        LinkedList<Double> doubleList = new LinkedList<Double>();
        for (Double j : doubleArray) {
            doubleList.add(j);
        }
        Iterator j = doubleList.iterator();
        logger.info("List of double array elements");
        while (j.hasNext()) {
            logger.info(j.next());
        }

        LinkedList<Character> charList = new LinkedList<Character>();
        for (Character k : characterArray) {
            charList.add(k);
        }
        Iterator k = charList.iterator();
        logger.info("List of character array elements");

        while (k.hasNext()) {
            logger.info(k.next());
        }

    }

}
