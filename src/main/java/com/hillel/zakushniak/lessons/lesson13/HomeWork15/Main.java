package com.hillel.zakushniak.lessons.lesson13.HomeWork15;

public class Main {
    public static void main(String[] args) {

        Androids Samsung = new Androids("Galaxy");
        System.out.println(Samsung.getName() + "\n" + "Operation system is " + Samsung.getOperationSystem());
        Samsung.call();
        Samsung.sms();
        Samsung.internet();

        System.out.println();

        IPhones iPhone13 = new IPhones("iPhone13");
        System.out.println(iPhone13.getName() + "\n" + "Operation system is " + iPhone13.getOperationSystem());
        iPhone13.call();
        iPhone13.sms();
        iPhone13.internet();
    }
}
