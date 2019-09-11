package com.ranguht.code.javabasics;
import java.util.Iterator;
import java.util.LinkedList;
public class CollectionLinkedList11Sep2019 {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();

        ll.add("Rangu");
        ll.add("Naresh");
        ll.add("QA");

        Iterator<String> itr=ll.iterator();
                while (itr.hasNext())
                    System.out.println(itr.next());

        LinkedList<String> des1=new LinkedList<String>();
        des1.add("R");
        des1.add("s");
        des1.add("Q");
        Iterator<String>itr1=des1.descendingIterator();
        while (itr1.hasNext())
            System.out.println(itr1.next());


    }
}
