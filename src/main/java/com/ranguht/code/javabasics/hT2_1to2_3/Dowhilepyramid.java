package com.ranguht.code.javabasics.hT2_1to2_3;

public class Dowhilepyramid {
        static int counter=0;
        static int x;
        public static void main(String[] args) {

            dowhilepyramid(5,1);

        }

        public static void dowhilepyramid(int num,int x) {
            int  i = 1, j = 1, count =0;


            do{
                do {
                    System.out.print(count + "   ");
                    j++;
                    count = count + x;
                }while (j <= i) ;
                System.out.print("\n");
                i++;
                j = 1;
            }while (i <= num);
        }

    }


