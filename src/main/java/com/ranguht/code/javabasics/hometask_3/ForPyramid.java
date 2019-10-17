package com.ranguht.code.javabasics.hometask_3;

import java.util.Scanner;

public class ForPyramid {
    static int counter = 0;
    static int difference = 0;

    public static void main(String[] args) {
        System.out.println("Enter the integer number : ");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();

        System.out.println("Enter the integer for difference : ");
        int difference = s.nextInt();

        pyramidFor(number, difference);
    }

    public static void pyramidFor(int number, int difference) {
        for (int row = 1; row < number; row++) {

            for (int column = 1; column < row + 1; column++) {
                System.out.print(counter + " ");
                counter = counter + difference;
            }
            System.out.println("");
        }
    }
}