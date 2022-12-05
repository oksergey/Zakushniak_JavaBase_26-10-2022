package com.hillel.zakushniak.lessons.lesson6;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number;
        int randomNumber = (int) (Math.random() * 11);
        System.out.println("Find my number from 0 to 10. You have 5 attempts");

        for (int i = 4; i >= 0; i--) {

            System.out.println("Please enter number");

            while (true) {

                if (scan.hasNextInt()) {
                    number = scan.nextInt();
                    scan.nextLine();
                    break;

                } else {
                    System.out.println("Wrong data! Try again.");
                    scan.nextLine();
                }
            }

            if (number == randomNumber) {
                System.out.println("Congratulations! You found the number!");
                break;
            }
            if (number > randomNumber) {
                System.out.println("My number is less then " + number);
                System.out.println("You have " + i + " attempts left.");


            } else {
                System.out.println("My number is greater then " + number);
                System.out.println("You have " + i + " attempts left.");
            }
            if (i == 0) {
                System.out.println("unfortunately the attempts are over, my number is " + randomNumber);

            }

        }


    }
}
