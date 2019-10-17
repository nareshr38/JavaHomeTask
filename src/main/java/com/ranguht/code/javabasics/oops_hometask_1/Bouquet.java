package com.ranguht.code.javabasics.oops_hometask_1;
import java.util.ArrayList;
import java.util.Scanner;


public class Bouquet {

    public static void main(String[] args) {

        System.out.println("Enter the integer for rosecost: ");
        Scanner s = new Scanner(System.in);
        int roseCost = s.nextInt();

        System.out.println("Enter the integer for roseqty: ");
        int roseqty = s.nextInt();

        System.out.println("Enter the integer for lillycost: ");
        int lillyCost = s.nextInt();

        System.out.println("Enter the integer for lillyqty: ");
        int lillyQty = s.nextInt();


        RoseFlower roseBq = new RoseFlower();
        roseBq.setCost(roseCost);
        roseBq.setQuantity(roseqty);
        int c = roseBq.getCost();
        int d = roseBq.getQuantity();

        LillyFlower lf = new LillyFlower();
        lf.setCost(lillyCost);
        int e = lf.getCost();
        lf.setQuantity(lillyQty);
        int f = lf.getQuantity();


        ArrayList list = new ArrayList();
        list.add(roseBq.costOfFlowers("blackRose", c, d));
        list.add(lf.costOfFlowers("lilly",e,f));
        for (int j = 0; j < list.size(); j++) {

        }
        System.out.println("Rose bouquet cost =" + " " + list.get(0));
        System.out.println("lilly bouquet cost =" + " " + list.get(1));


    }
}

