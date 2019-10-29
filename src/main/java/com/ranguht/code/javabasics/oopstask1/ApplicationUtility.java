package com.ranguht.code.javabasics.oopstask1;

public class ApplicationUtility {
    private ApplicationUtility() {
    }

    public static int calculateCostOfBouquet(Bouquet bouquet) {

        int costOfBouquet = 0;
        for (Flower flower : bouquet.getFlowers()) {
            costOfBouquet = costOfBouquet + flower.cost;
        }
        return costOfBouquet;
    }

}
