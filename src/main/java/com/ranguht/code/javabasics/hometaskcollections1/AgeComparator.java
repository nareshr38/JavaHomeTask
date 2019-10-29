package com.ranguht.code.javabasics.hometaskcollections1;
import java.util.Comparator;

public class AgeComparator implements Comparator {

    public int compare(Object o1,Object o2) {
        Student1Comparator s1 = (Student1Comparator) o1;
        Student1Comparator s2 = (Student1Comparator) o2;


        if(s1.age==s2.age)
        {
            return 0;

        }
        else if (s1.age>s2.age)
        {
            return 1;
        }
        else
        {
            return -1;
        }

    }
}
