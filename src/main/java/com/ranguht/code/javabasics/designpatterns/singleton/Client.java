package com.ranguht.code.javabasics.designpatterns.singleton;

public class Client {
    public static void main(String[] args) {
        NetworkConnection connection = NetworkConnection.getConnection();
        NetworkConnection anotherConnection = NetworkConnection.getConnection();

        connection.connect();
        anotherConnection.connect();
        anotherConnection.disconnect();
        connection.connect();
        connection.disconnect();
        anotherConnection.disconnect();
    }
}
