package com.ranguht.code.javabasics.oops_hometask_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Gift  {
    public static void main(String[] args) {
        System.out.println("Enter the total number of chocolates in a gift: ");
        Scanner s = new Scanner(System.in);
        int noOfSweets = s.nextInt();


        System.out.println("Enter the weight of each chocolate: ");
        Scanner s1 = new Scanner(System.in);
        int weight = s1.nextInt();

        Chocolates chocGift=new Chocolates();
        chocGift.setNoOfSweets(noOfSweets);
        chocGift.setWeight(weight);
        int c = chocGift.getNoOfSweets();
        int d = chocGift.getWeight();


        System.out.println("Enter the total number of candies in a gift: ");
        int noOfCandies = s.nextInt();


        System.out.println("Enter the weight of each candy: ");
        int weightOfeachCandy = s.nextInt();

        Candies candiesGift=new Candies();
        candiesGift.setNoOfSweets(noOfCandies);
        candiesGift.setWeight(weightOfeachCandy);
        int e = candiesGift.getNoOfSweets();
        int f = candiesGift.getWeight();


        ArrayList list = new ArrayList();
        list.add(chocGift.totalQuantity("Five star",c,d));
        list.add(chocGift.totalQuantity("BarOne",c,d));
        list.add(candiesGift.totalQuantity("Lollipops",e,f));
        list.add(candiesGift.totalQuantity("Gummies",e,f));
       /* int counter=0;
        for (int j = 0; j < list.size(); j++) {
           counter= counter+(list.get(0));
            System.out.println(counter);

        }*/
        System.out.println("Five star weight in a gift =" + " " + list.get(0));
        System.out.println("BarOne weight in a gift=" + " " + list.get(1));
        System.out.println("Lollipops weight in a gift =" + " " + list.get(2));
        System.out.println("Gummies weight in a gift =" + " " + list.get(3));

    }
}
