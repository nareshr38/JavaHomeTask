package com.ranguht.code.javabasics.Sessions;
import java.util.*;
public class Collections_TreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet=new TreeSet<String>();
        treeSet.add("1");
        treeSet.add("nar");
        treeSet.add("ran");
        Iterator<String> itr=treeSet.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}

//Using Treeset inorder to sort in Ascending order, it doesn't include different datatypes, it doesn't allow nulls