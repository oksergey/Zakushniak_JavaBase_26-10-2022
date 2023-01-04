package com.hillel.zakushniak.lessons.lesson13.HomeWork16;

public class RockMusic extends MusicStyles {

    public RockMusic(String name) {
        super(name);
    }

    @Override
    void playMusic() {
        System.out.println(name + " playing Rock...");
    }
}
