package com.hillel.zakushniak.lessons.lesson13.HomeWork16;

public class Main {
    public static void main(String[] args) {

        PopMusic gurt1 = new PopMusic("Dzidzio");
        RockMusic gurt2 = new RockMusic("Okean Elzy");
        ClassicMusic gurt3 = new ClassicMusic("Picardy Tertiary");

        MusicStyles[] concert = {gurt1, gurt2, gurt3};

        for (MusicStyles gurt : concert) {
            gurt.playMusic();
            System.out.println();
        }

    }
}
