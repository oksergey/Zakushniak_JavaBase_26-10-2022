package com.hillel.zakushniak.lessons.lesson11.HomeWork13;

public class Burger {

    String typeOfBurger;
    String bun;
    String meat;
    String mayonnaise;
    String cheese;
    String greens;



    //звичайний
    Burger(String bun, String meat, String mayonnaise, String cheese, String greens) {
        this.typeOfBurger = "Common";
        this.bun = bun;
        this.meat = meat;
        this.mayonnaise = mayonnaise;
        this.cheese = cheese;
        this.greens = greens;

//        System.out.println("Звичайний бургер:");
        System.out.println(this);
        System.out.println();
    }

    //дієтичний
    Burger(String bun, String meat, String cheese, String greens) {
        this.typeOfBurger = "Diet";
        this.bun = bun;
        this.meat = meat;
        this.mayonnaise = "is absent";
        this.cheese = cheese;
        this.greens = greens;

//        System.out.println("Дієтичний бургер:");
        System.out.println(this);
        System.out.println();
    }

    //з подвійним м'ясом, якщо не подвійне, то створюємо звичайний
    Burger(String bun, String meat, String mayonnaise, String cheese, String greens, boolean isDouble) {
        if (isDouble) {
            this.typeOfBurger = "Double";
            this.bun = bun;
            this.meat = "double " + meat;
            this.mayonnaise = mayonnaise;
            this.cheese = cheese;
            this.greens = greens;
            System.out.println(this);
            System.out.println();

        } else new Burger(bun, meat, mayonnaise, cheese, greens);


    }

    @Override
    public String toString() {
        return "Burger " +
                typeOfBurger + '\n' +
                "bun='" + bun + '\'' +
                ", meat='" + meat + '\'' +
                ", mayonnaise='" + mayonnaise + '\'' +
                ", cheese='" + cheese + '\'' +
                ", greens='" + greens + '\'';
    }
}
