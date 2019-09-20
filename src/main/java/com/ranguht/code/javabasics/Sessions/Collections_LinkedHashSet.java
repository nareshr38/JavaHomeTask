package com.ranguht.code.javabasics.Sessions;
import java.util.*;
public class Collections_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<String>();
        lhs.add("RN");
        lhs.add("Kumar");
        lhs.add("Rangu");
        Iterator<String>itr=lhs.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}

//Linked Hashset is used to preserve the insertion order, it does not allow duplicates