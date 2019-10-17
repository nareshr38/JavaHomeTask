package com.ranguht.code.javabasics.hT2_1to2_3;

public class Inorder {
        static int a,b,c;
        static boolean b0k = true;
        public static void main(String[] args) {
            boolean OrderResult=  Order(1,2,4,false);
            System.out.println(OrderResult);

        }

        public static boolean Order(int a,int b,int c,boolean b0k) {

            if (b0k == true &&c>b)
                return  true;
            else if  (b>a && c>b)
                return true;
            else
                return false;


        }
    }
