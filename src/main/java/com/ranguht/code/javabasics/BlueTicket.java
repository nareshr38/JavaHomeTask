package com.ranguht.code.javabasics;
public class BlueTicket {
        static  int a,b,c;
        public static void main(String[] args) {
            int TicketResult= ticket(4,11,1);
            System.out.println(TicketResult);
        }
        public static int ticket(int a,int b,int c) {
            if(a+b==10 || b+c==10 || c+a==10)
                return 10;
            else if((a+b >= b+c+10) ||(a+b >= c+a+10))
                return 5;
            else
                return 0;
        }
    }

