package com.hillel.zakushniak.lessons.lesson13.HomeWork15;

public interface Smartphones {

    default void call(){
        System.out.println("Making call...");
    }

    default void sms(){
        System.out.println("Sending sms...");
    }

    default void internet(){
        System.out.println("Connecting to address...");
    }


}
