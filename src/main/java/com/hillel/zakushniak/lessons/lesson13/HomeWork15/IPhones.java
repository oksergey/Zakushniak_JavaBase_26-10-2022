package com.hillel.zakushniak.lessons.lesson13.HomeWork15;

public class IPhones implements Smartphones, IOS {

    String name;

    public IPhones(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
