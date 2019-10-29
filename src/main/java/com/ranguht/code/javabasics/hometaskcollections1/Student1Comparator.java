package com.ranguht.code.javabasics.hometaskcollections1;

import java.util.ArrayList;
        import java.util.Collections;

public class Student1Comparator {

    int age;
    String name;
    int rollno;
    Student1Comparator(int age, String name, int rollno)
    {
        this.age=age;
        this.name=name;
        this.rollno=rollno;
    }

    public static void main(String[] args) {
        ArrayList<Student1Comparator> list=new ArrayList<Student1Comparator>();
        list.add(new Student1Comparator(101,"Vijay",23));
        list.add(new Student1Comparator(106,"Ajay",27));
        list.add(new Student1Comparator(105,"Jai",21));

        System.out.println("Sorting by Name");
        Collections.sort(list,new NameComparator());

        for(Student1Comparator st: list){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("Sorting by Age");
        Collections.sort(list,new AgeComparator());

        for(Student1Comparator st: list){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}