package com.hillel.zakushniak.lessons.lesson14.HomeWork17;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        makeOrder();

    }

    private static void makeOrder() {

        Scanner input = new Scanner(System.in);

        DrinksMachine[] drinks = DrinksMachine.values();

        DrinksMachine userDrink = null;

        String userInput;
        do {
            System.out.println();
            System.out.println("Please choose option from the list: " + Arrays.toString(drinks));
            System.out.println("Type Payout when all needed drinks made");

            while (true) {

                userInput = input.nextLine().toUpperCase();


                for (DrinksMachine drink : drinks) {
                    if (drink.toString().equals(userInput)) {
                        userDrink = DrinksMachine.valueOf(userInput);
                        break;
                    }
                }


                if (userDrink != null) {
                    break;
                }
                System.out.println("Wrong choice. Please try again!");
            }

            switch (userDrink) {
                case COFFEE:
                case TEA:
                case LEMONADE:
                case MOJITO:
                case WATER:
                case COKE: {
                    new Drinks(userDrink.drink, userDrink.price);
                    break;
                }

                case PAYOUT: {
                    if (Drinks.getDrinksQuantity() == 0) {
                        System.out.println("Ми не дамо вам вмерти від спраги! Будь ласка зробіть замовлення :0)");
                        userInput = "";
                    } else {
                        System.out.println("Кількість замовлених напоїв: " + Drinks.getDrinksQuantity() + " шт.\n" +
                                "Загальна вартість складає " + Drinks.getOrderPrice() + " гривень.");
                    }
                }

            }
        }
        while (!userInput.equals("PAYOUT"));

    }
}
