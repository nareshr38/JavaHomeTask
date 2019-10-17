package com.ranguht.code.javabasics.hometask_collections_1;

import java.util.ArrayList;
import java.util.Collections;

public class SortingStudent_Comparable {
    public static void main(String[] args) {

        ArrayList<Student_comparable> list=new ArrayList();
        list.add(new Student_comparable(3,"Naresh",101));
        list.add(new Student_comparable(1,"Rangu",102));
        list.add(new Student_comparable(2,"Kumar",103));

        Collections.sort(list);
        for (Student_comparable b:list)
        {
            System.out.println(b.age +b.name +b.rollno);
        }



    }

}