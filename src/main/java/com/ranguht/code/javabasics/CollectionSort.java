package com.ranguht.code.javabasics;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort {
    public static void main(String[] args) {
       ArrayList<Integer> list=new ArrayList<Integer>();
       list.add(4);
       list.add(2);
       list.add(10);
        Collections.sort(list);
       for (Integer s:list)
       {
           System.out.println(s);
       }
    }
}
