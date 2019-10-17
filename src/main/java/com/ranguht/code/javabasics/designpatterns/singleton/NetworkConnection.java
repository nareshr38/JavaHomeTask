package com.ranguht.code.javabasics.designpatterns.singleton;
public class NetworkConnection {

    public static NetworkConnection connection;

    public static synchronized NetworkConnection getConnection() {
        if (connection == null) {
            connection = new NetworkConnection();
        }
        return connection;
    }

    private NetworkConnection() {
        if (connection != null) {
            throw new RuntimeException("use getInstance() to create object.");
        }
    }

    private boolean isConnected = false;

    public void connect() {
        if (!isConnected) {
            System.out.println("Executing the network connect code.");
            System.out.println("Network connected.");
            isConnected = true;
        } else {
            System.out.println("Network already connected. ");
        }
    }

    public void disconnect() {
        if (isConnected) {
            System.out.println("Executing the network disconnect code.");
            System.out.println("Network disconnected.");
            isConnected = false;
        } else {
            System.out.println("Network already disconnected");
        }

    }

}