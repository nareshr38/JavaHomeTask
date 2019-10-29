package com.ranguht.code.javabasics.hometask_collections_1;

import java.util.Comparator;

public class NameComparator implements Comparator {

    public int compare(Object o1,Object o2) {
        Student1Comparator s1 = (Student1Comparator) o1;
        Student1Comparator s2 = (Student1Comparator) o2;
        return s1.name.compareTo(s2.name);
    }
}