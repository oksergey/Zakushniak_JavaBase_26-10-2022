package com.hillel.zakushniak.lessons.lesson13.HomeWork15;

public class Androids implements Smartphones, LinuxOS {

    String name;

    public Androids(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
