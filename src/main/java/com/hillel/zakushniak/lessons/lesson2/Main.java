package com.hillel.zakushniak.lessons.lesson2;

public class Main {
    public static void main(String[] args) {

        double latitude = 46.48810448617379;
        double longitude = 30.741153219120537;

        short latitudeDegree = (short) latitude;
        short latitudeMinutes = (short) ((latitude-latitudeDegree)*60);
        float latitudeSeconds = (float) (((latitude-latitudeDegree)*60-latitudeMinutes)*60);

        short longitudeDegree = (short) longitude;
        short longitudeMinutes = (short) ((longitude-longitudeDegree)*60);
        float longitudeSeconds = (float) (((longitude-longitudeDegree)*60-longitudeMinutes)*60);

        System.out.println("Координаты Дюка де Ришелье в Одессе!");
        System.out.println("Десятичные градусы:" + latitude + ", " + longitude);
        System.out.println("Градусы, минуты и секунды: " + latitudeDegree + "\u00B0 " + latitudeMinutes +"\u0027 " + latitudeSeconds + "\"N   " + longitudeDegree + "\u00B0 " + longitudeMinutes +"\u0027 " + longitudeSeconds + "\"E");
//        System.out.println(charA2);
//        System.out.println(charA3);

//                String
    }

}
 