package com.ranguht.code.javabasics.hometask_5;
import java.util.Scanner;

public class SumNumbers {
    /*  public static void main(String[] args) {

          System.out.println("Enter input string: ");
          Scanner sc = new Scanner(System.in);
          String inputString = sc.nextLine();

          int SumNumbersResult = numberFindInString(inputString);
          System.out.println(SumNumbersResult);

      }
  */
    public static int numberFindInString(String inputString) {
        int sum = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isDigit(inputString.charAt(i))) {
                int counter = 0;
                for (int j = i; j < inputString.length(); j++) {
                    if (Character.isDigit(inputString.charAt(j)))
                        counter++;
                    else break;
                }
                sum += Integer.parseInt(inputString.substring(i, i + counter));
                i += counter;
            }
        }
        return sum;
    }

}