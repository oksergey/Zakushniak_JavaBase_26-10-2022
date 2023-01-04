package com.hillel.zakushniak.lessons.lesson13.HomeWork16;

public class ClassicMusic extends MusicStyles{

    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    void playMusic (){
        System.out.println(name + " playing Classic...");
    }
}
