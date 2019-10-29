package com.ranguht.code.javabasics.hometaskcollections1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;

public class SortingStudentComparable {
    private static final Logger logger = LogManager.getLogger(SortingStudentComparable.class.getName());
    public static void main(String[] args) {

        ArrayList<Studentcomparable> list=new ArrayList();
        list.add(new Studentcomparable(3,"Naresh",101));
        list.add(new Studentcomparable(1,"Rangu",102));
        list.add(new Studentcomparable(2,"Kumar",103));

        Collections.sort(list);
        for (Studentcomparable b:list)
        {
            logger.info(b.age +b.name +b.rollno);
        }



    }

}