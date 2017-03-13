package com.example.armin.elabproject;

/**
 * Created by Armin on 13.03.2017.
 */

public class Person {
    private String name;
    private int gebJahr;

    public Person(String name, int gebJahr) {
        this.name = name;
        this.gebJahr = gebJahr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGebJahr() {
        return gebJahr;
    }

    public void setGebJahr(int gebJahr) {
        this.gebJahr = gebJahr;
    }
}
