package com.ranguht.code.javabasics.Sessions;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionsHashSet11Sep2019 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<String>();
        list.add("Nar");
        list.add("Ran");
        list.add("Nar"); //dup
        list.add("QA");

        HashSet<String>hs=new HashSet<String>(list);
        Iterator<String>itr=hs.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());


    }
}
