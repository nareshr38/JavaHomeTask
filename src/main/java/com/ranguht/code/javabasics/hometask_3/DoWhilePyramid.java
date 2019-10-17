package com.ranguht.code.javabasics.hometask_3;

import java.util.Scanner;

public class DoWhilePyramid {
    static int counter = 0;

    public static void main(String[] args) {

        System.out.println("Enter the integer number : ");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();

        System.out.println("Enter the integer for difference : ");
        int difference = s.nextInt();

        pyramidDoWhile(number, difference);

    }

    public static void pyramidDoWhile(int number, int difference) {


        int row = 1;
        int column = 1;
        do {
            do {
                System.out.print(counter + " ");
                counter = counter + difference;
                column++;
            } while (column < row + 1);

            System.out.print("\n");
            row++;
            column = 1;
        } while (row < number);

    }

}