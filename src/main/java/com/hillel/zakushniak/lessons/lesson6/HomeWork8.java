package com.hillel.zakushniak.lessons.lesson6;

public class HomeWork8 {
    public static void main(String[] args) {

        String shutleList = "";
        int counter = 0;

        for (int i = 0; i <= 10; i++) {
            if (i == 4 || i == 9) {
                continue;
            }
            for (int j = 0; j <= 9; j++) {
                if (j == 4 || j == 9 || i + j == 0) {
                    continue;
                }
                if ((i * 10 + j) == 100) {
                    shutleList = shutleList + i + j + ".";
                    counter += 1;
                    break;

                }
                shutleList = shutleList + i + j + ", ";
                counter += 1;
            }

        }
        System.out.println("Shutle list: " + shutleList);
        System.out.println("Shutle quntity: " + counter);
    }
}
