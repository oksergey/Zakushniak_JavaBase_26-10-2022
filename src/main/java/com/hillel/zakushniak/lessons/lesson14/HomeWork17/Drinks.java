package com.hillel.zakushniak.lessons.lesson14.HomeWork17;

public class Drinks {

    //КАВУ, ЧАЙ, ЛИМОНАД, МОХІТО, МИНЕРАЛКУ, КОКА_КОЛУ
    public static final int coffeeCost = 50;
    public static final int teaCost = 30;
    public static final int lemonadeCost = 15;
    public static final int mojitoCost = 40;
    public static final int waterCost = 10;
    public static final int cokeCost = 20;

   private static int orderPrice;
    private static int drinksQuantity;

    public Drinks(String typeOfDrink, int cost) {
        drinksQuantity++;
        orderPrice += cost;
        System.out.println("Preparing " + typeOfDrink + "...");
    }

    public static int getOrderPrice() {
        return orderPrice;
    }

    public static int getDrinksQuantity() {
        return drinksQuantity;
    }
}

