package com.ranguht.code.javabasics.hometask_collections_1;

public class Student_comparable implements Comparable<Student_comparable>{
    int age;
    String name;
    int rollno;
    Student_comparable(int age, String name, int rollno)
    {
        this.age=age;
        this.name=name;
        this.rollno=rollno;
    }

    public int compareTo(Student_comparable s){
        if(this.age==s.age){
            return 0;
        }else  if(this.age>=s.age){
            return 1;
        }else{
            return  -1;
        }
    }
}
