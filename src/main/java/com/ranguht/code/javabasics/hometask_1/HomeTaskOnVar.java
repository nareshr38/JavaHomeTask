package com.ranguht.code.javabasics.hometask_1;

import java.util.Scanner;

public class HomeTaskOnVar {
    public static void main(String[] args) {
        int daniel;
        int amber;
        System.out.println("Enter the number of apples daniel have : ");
        Scanner s = new Scanner(System.in);
        daniel = s.nextInt();

        System.out.println("Enter the number of apples amber have : ");
        amber = s.nextInt();

        int totalNumberOfApples = applesCount(daniel, amber);

        System.out.println("total number of apples both daniel and amber had :" + totalNumberOfApples);
    }

    public static int applesCount(int daniel, int amber) {
        int countOfApples = daniel + amber;
        return countOfApples;
    }

}
