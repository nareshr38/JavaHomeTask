package com.ranguht.code.javabasics.hometask_collections_1;

import java.util.ArrayList;
import java.util.Collections;

public class SortingStudentComparable {
    public static void main(String[] args) {

        ArrayList<Studentcomparable> list=new ArrayList();
        list.add(new Studentcomparable(3,"Naresh",101));
        list.add(new Studentcomparable(1,"Rangu",102));
        list.add(new Studentcomparable(2,"Kumar",103));

        Collections.sort(list);
        for (Studentcomparable b:list)
        {
            System.out.println(b.age +b.name +b.rollno);
        }



    }

}