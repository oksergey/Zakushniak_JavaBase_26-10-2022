package com.hillel.zakushniak.lessons.lesson7;

import java.util.Arrays;

public class HomeWork9 {
    public static void main(String[] args) {

        int playersInComand = 25;
        int[] comand1 = new int[playersInComand];
        int[] comand2 = new int[playersInComand];

        for (int i = 0; i < playersInComand; i++) {
            comand1[i] = (int) ((Math.random() * 23) + 18);
            comand2[i] = (int) ((Math.random() * 23) + 18);

        }

        System.out.println("1st command player's ages: " + Arrays.toString(comand1));
        System.out.println("2nd command player's ages: " + Arrays.toString(comand2));


        int comand1AgeSum = 0;
        int comand2AgeSum = 0;


        for (int i = 0; i < playersInComand; i++) {
            comand1AgeSum += comand1[i];
            comand2AgeSum += comand2[i];
        }

        System.out.println("Average age of 1st command: " + (double) comand1AgeSum / playersInComand);
        System.out.println("Average age of 2nd command: " + (double) comand2AgeSum / playersInComand);

    }
}
