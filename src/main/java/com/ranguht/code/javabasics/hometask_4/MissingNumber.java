package com.ranguht.code.javabasics.hometask_4;

public class MissingNumber {

    public static void main(String[] args) {
        int limit=100;
        int input_array[] = {5, 8, 22, 3, 10,1};
        boolean is_present = true;
        for(int i=0;i<=limit;i++)
        {
            for (int number:input_array)
            {
                if (number==i)
                {
                    is_present=false;
                }
            }
            if (is_present)
            {
                System.out.print(i+" ");

            }
            is_present=true;
        }
    }

    /*public static void main(String[] args) {
        int a[] = {1, 2, 3, 5, 6};
        int miss = getMissingNo(a, 5);
        System.out.println(miss);
    }

    public static int getMissingNo(int a[], int n) {

        int i, total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total = total - a[i];
        return total;


    }*/
}