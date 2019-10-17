package com.ranguht.code.javabasics.designpatterns.builder;

public class Client {
    public static void main(String[] args) {


        User_BuilderEx user1 = new User_BuilderEx.UserBuilder("Lokesh", "Gupta")
                .age(30)
                .phone("1234567")
                .address("Fake address 1234")
                .build();

        System.out.println(user1);

        User_BuilderEx user2 = new User_BuilderEx.UserBuilder("Jack", "Reacher")
                .age(40)
                .phone("5655")
                //no address
                .build();

        System.out.println(user2);

        User_BuilderEx user3 = new User_BuilderEx.UserBuilder("Super", "Man")
                //No age
                //No phone
                //no address
                .build();

        System.out.println(user3);
    }
}