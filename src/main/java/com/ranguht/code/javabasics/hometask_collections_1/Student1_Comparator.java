package com.ranguht.code.javabasics.hometask_collections_1;

import java.util.ArrayList;
        import java.util.Collections;

public class Student1_Comparator {

    int age;
    String name;
    int rollno;
    Student1_Comparator(int age, String name, int rollno)
    {
        this.age=age;
        this.name=name;
        this.rollno=rollno;
    }

    public static void main(String[] args) {
        ArrayList<Student1_Comparator> list=new ArrayList<Student1_Comparator>();
        list.add(new Student1_Comparator(101,"Vijay",23));
        list.add(new Student1_Comparator(106,"Ajay",27));
        list.add(new Student1_Comparator(105,"Jai",21));

        System.out.println("Sorting by Name");
        Collections.sort(list,new NameComparator());

        for(Student1_Comparator st: list){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("Sorting by Age");
        Collections.sort(list,new AgeComparator());

        for(Student1_Comparator st: list){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}