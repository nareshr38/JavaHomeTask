package com.ranguht.code.javabasics;

import java.util.ArrayList;

public class TestRevArryList {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(3);
        list.add(4);
        //list.clear();
        list.add("Naresh");
        //list.remove(1);
        //list.add(0,"hello");
        list.add(1,2);
        int index=list.indexOf(4);
        System.out.println("index of 4 is" +index);
       // int length=list.size();
            for (int i=list.size()-1;i>=0;i--)
            {
                System.out.println(list.get(i));
            }
    }
}
