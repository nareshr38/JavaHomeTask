package com.ranguht.code.javabasics.hometask_3;
import java.util.Scanner;

public class WhilePyramid {
    static int counter = 0;
    static int x;

    public static void main(String[] args) {

        System.out.println("Enter the integer number : ");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();

        System.out.println("Enter the integer for difference : ");
        int difference = s.nextInt();

        pyramidWhile(number, difference);

    }

    public static void pyramidWhile(int number, int difference) {
        int row = 1;
        while (row < number) {
            int column = 1;

            while (column < row + 1) {
                System.out.print(counter + " ");
                counter = counter + difference;
                column++;
            }
            row++;
            System.out.println("");
        }

    }
}