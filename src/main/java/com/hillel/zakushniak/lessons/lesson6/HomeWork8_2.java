package com.hillel.zakushniak.lessons.lesson6;

public class HomeWork8_2 {

    public static void main(String[] args) {

        System.out.print("Shuttle numbers: ");
        int counter = 0;

        for (int i = 1; counter < 100; i++) {

            if ( i / 100 == 4 || i / 100 == 9|| i / 10 % 10 == 4 || i / 10 % 10 == 9 || i % 10 == 4 || i % 10 == 9 ) {
                continue;
            }
            counter ++;
            System.out.print((counter < 100) ? i + ", " : i + ".");
        }
        System.out.println();
        System.out.println("Shuttle quantity: " + counter);

    }
}
