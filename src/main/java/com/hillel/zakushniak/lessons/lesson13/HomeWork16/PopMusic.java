package com.hillel.zakushniak.lessons.lesson13.HomeWork16;

public class PopMusic extends MusicStyles{

    public PopMusic(String name) {
        super(name);
    }

    @Override
    void playMusic (){
        System.out.println(name + " playing Pop...");
    }
}
