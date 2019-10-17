package com.ranguht.code.javabasics.oops_hometask_1;

public class RoseFlower implements Flower {

    private int cost;
    private int quantity;

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;

    }


    public int costOfFlowers(String typeOfRose, int cost, int quantity) {

        return cost * quantity;
    }
}
