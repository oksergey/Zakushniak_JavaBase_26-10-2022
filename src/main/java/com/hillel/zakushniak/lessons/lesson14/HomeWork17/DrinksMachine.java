package com.hillel.zakushniak.lessons.lesson14.HomeWork17;

public enum DrinksMachine {

    COFFEE("Кава", Drinks.coffeeCost),
    TEA("Чай", Drinks.teaCost),
    LEMONADE("Лимонад", Drinks.lemonadeCost),
    MOJITO("Мохіто", Drinks.mojitoCost),
    WATER("Мінеральна вода", Drinks.waterCost),
    COKE("Кока-кола", Drinks.cokeCost),
    PAYOUT;

    String drink;
    int price;

    DrinksMachine(String drink, int price) {
        this.drink = drink;
        this.price = price;
    }

    DrinksMachine() {
    }
}
