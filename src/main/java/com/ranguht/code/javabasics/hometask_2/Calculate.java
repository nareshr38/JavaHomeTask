package com.ranguht.code.javabasics.hometask_2;

public class Calculate {
    public static void main(String[] args) {

        double firstNumber = Double.parseDouble(args[0]);
        double secondNumber = Double.parseDouble(args[1]);
        String operation = args[2];

        if (operation.equals("+")) {
            System.out.println("Addition : " + (firstNumber + secondNumber));
        } else if (operation.equals("-")) {
            System.out.println("Subtraction :" + (firstNumber - secondNumber));
        } else if (operation.equals("*")) {
            System.out.println("Multiplication :" + firstNumber * secondNumber);
        } else if (operation.equals("/")) {
            System.out.println("Division :" + (firstNumber / secondNumber));
        } else if (operation.equals("%")) {
            System.out.println("Remainder :" + (firstNumber % secondNumber));
        } else {
            System.out.println("percentage:" + (firstNumber / secondNumber) * 100);
        }
    }
}