package com.ranguht.code.javabasics.hometask_collections_1;

public class Studentcomparable implements Comparable<Studentcomparable>{
    int age;
    String name;
    int rollno;
    Studentcomparable(int age, String name, int rollno)
    {
        this.age=age;
        this.name=name;
        this.rollno=rollno;
    }

    public int compareTo(Studentcomparable s){
        if(this.age==s.age){
            return 0;
        }else  if(this.age>=s.age){
            return 1;
        }else{
            return  -1;
        }
    }
}
