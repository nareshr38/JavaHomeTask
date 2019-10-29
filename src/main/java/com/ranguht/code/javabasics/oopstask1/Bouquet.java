package com.ranguht.code.javabasics.oopstask1;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private List<Flower> flowers = new ArrayList<Flower>();

    public void add(int quantity, Flower flower) {
        for (int quantityCounter = 1; quantityCounter <= quantity; quantityCounter++) {
            flowers.add(flower);
        }
    }

    public void add(Flower flower) {
        flowers.add(flower);
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

}
