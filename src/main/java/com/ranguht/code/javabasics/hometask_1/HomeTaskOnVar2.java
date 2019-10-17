package com.ranguht.code.javabasics.hometask_1;

import java.util.Scanner;

public class HomeTaskOnVar2 {
    public static void main(String[] args) {
        double daniel;
        double amber;
        System.out.println("Enter the number of apples daniel have : ");
        Scanner s = new Scanner(System.in);
        daniel = s.nextDouble();

        System.out.println("Enter the double for Amber: ");
        amber = s.nextDouble();

        double totalNumberOfApples = applesCount(daniel, amber);

        System.out.println("total number of apples both daniel and amber had :" + totalNumberOfApples);
    }

    public static double applesCount(double daniel, double amber) {
        double countOfApples = daniel + amber;
        return countOfApples;
    }
}