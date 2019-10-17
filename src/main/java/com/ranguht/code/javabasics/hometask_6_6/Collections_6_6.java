package com.ranguht.code.javabasics.hometask_6_6;
import java.util.Iterator;
        import java.util.LinkedList;

public class Collections_6_6 {
    public static void main(String args[]) {

        Collections_6_6 arr= new Collections_6_6();
        arr.printArray();


    }

    public void printArray() {

        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        LinkedList <Integer> integerList =new LinkedList<Integer>();
        System.out.println("List of integer array elements");

        for (int i: integerArray)
        {
            integerList.add(i);
        }
        Iterator i = integerList.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        LinkedList <Double> doubleList =new LinkedList<Double>();
        for (Double j: doubleArray)
        {
            doubleList.add(j);
        }
        Iterator j = doubleList.iterator();
        System.out.println("List of double array elements");
        while(j.hasNext())
        {
            System.out.println(j.next());
        }

        LinkedList <Character> charList =new LinkedList<Character>();
        for (Character k: characterArray)
        {
            charList.add(k);
        }
        Iterator k = charList.iterator();
        System.out.println("List of character array elements");

        while(k.hasNext())
        {
            System.out.println(k.next());
        }

    }

}
