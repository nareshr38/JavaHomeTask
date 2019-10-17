package com.ranguht.code.javabasics.oops_hometask_2;

public class Chocolates implements Sweets {
    private  int noOfSweets;
    private int weight;

    public int getNoOfSweets() {
        return noOfSweets;
    }

    public void setNoOfSweets(int noOfSweets) {
        this.noOfSweets = noOfSweets;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int totalQuantity(String typeOfSweet,int noOfSweets, int weight) {
        return noOfSweets * weight;
    }
}

