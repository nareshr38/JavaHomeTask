package com.ranguht.code.javabasics;

public class Whilepyramid {
    static int counter=0;
    static int x;
    public static void main(String[] args) {
        pyramidwhile(6,3);
    }


    public static void pyramidwhile(int number,int x) {

        int row=1;
        while(row<number) {
            int column = 1;
            while (column < row + 1) {
                System.out.print(counter + " ");
                counter = counter + x;
                column++;
            }
            System.out.println("");
            row++;
        }

    }
}