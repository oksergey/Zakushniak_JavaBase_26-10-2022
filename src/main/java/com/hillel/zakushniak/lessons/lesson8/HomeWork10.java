package com.hillel.zakushniak.lessons.lesson8;

import java.util.Arrays;

public class HomeWork10 {
    public static void main(String[] args) {
        int numbers = 7;
        int[] organizerArray = new int[numbers];
        int[] playerArray = new int[numbers];

        for (int i = 0; i < organizerArray.length; i++) {

            organizerArray[i] = (int) (Math.random() * 10);
            playerArray[i] = (int) (Math.random() * 10);

        }

        System.out.println("Числа фірми організатора: " + Arrays.toString(organizerArray));
        System.out.println("Номери що вказав гравець: " + Arrays.toString(playerArray));
        System.out.println();

        Arrays.sort(organizerArray);
        Arrays.sort(playerArray);

        System.out.println("Масиви після сортування: \n" + Arrays.toString(organizerArray));
        System.out.println(Arrays.toString(playerArray));


        int counter = -1;
        int[] resultsAr = new int[numbers];

        for (int i = 0; i < organizerArray.length; i++) {

            if (organizerArray[i] == playerArray[i]) {
                counter++;
                resultsAr[counter] = i;
            }

        }
       // System.out.println(Arrays.toString(resultsAr));

        switch (counter) {

            case -1: {
                System.out.println("Збіги відсутні!");
                break;
            }

            case 0: {
                System.out.println("Збігся тільки " + resultsAr[counter] + "й елемент");
                System.out.println("Кількість збігів: " + (counter + 1));
                break;
            }
            default: {
                String result = "";
                for (int i = 0; i < counter; i++) {
                    result = result + resultsAr[i] + "й ";
                }

                result = result + "та " + resultsAr[counter] + "й";
                System.out.println("Збіглися " + result + " елементи");
                System.out.println("Кількість збігів: " + (counter + 1));

            }
        }
    }
}
