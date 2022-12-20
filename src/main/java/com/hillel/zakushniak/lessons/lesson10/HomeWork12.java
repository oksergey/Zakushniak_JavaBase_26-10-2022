package com.hillel.zakushniak.lessons.lesson10;

public class HomeWork12 {

    public static void main(String[] args) {

        System.out.println(personInfo("Will", "Smith", "New York", "2936729462846"));
        System.out.println(personInfo("Jackie", "Chan", "Shanghai", "12312412412"));
        System.out.println(personInfo("Sherlock", "Holmes", "London", "37742123513"));

    }


    static String personInfo (String name, String surName, String city, String phone){
        return "Зателефонувати громадянинові " + name + " " + surName + " із міста " + city + " можна за номером " + phone;
    }
}
