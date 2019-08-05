package com.ranguht.code.javabasics;

public class Forpyramid {
    static int counter=0;
    static int x=0;
    public static void main(String[] args) {

        pyramidfor(6,1);
    }

    public static void pyramidfor(int number,int x) {
        for(int row=1;row<number;row++) {

            for (int column = 1; column < row + 1; column++) {
                System.out.print(counter + " ");
                counter = counter + x;

            }
            System.out.println("");
        }
    }
}