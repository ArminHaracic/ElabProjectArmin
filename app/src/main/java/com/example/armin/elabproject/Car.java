package com.example.armin.elabproject;

/**
 * Created by Armin on 13.03.2017.
 */

public class Car {
    private String name;
    private int baujahr;

    public Car(int baujahr, String name) {
        this.baujahr = baujahr;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }
}
