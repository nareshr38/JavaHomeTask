package com.ranguht.code.javabasics.Sessions;
import java.net.Inet4Address;
import java.util.*;
public class Collections_HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> hst = new Hashtable<Integer, String>();
        hst.put(1, "Rangu");
        hst.put(2, "Naresh");
        hst.put(3, "Parni");
        Set<Integer> set = hst.keySet();
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            Integer key = itr.next();
            System.out.println("keys-->" + key);
            System.out.println("value-->"+hst.get(key));
        }

    }
}