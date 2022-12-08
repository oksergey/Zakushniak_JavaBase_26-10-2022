package com.hillel.zakushniak.lessons.lesson6;

public class HomeWork8 {
    public static void main(String[] args) {

        //        for (int i = 0; i <= 10; i++) {
//            if (i == 4 || i == 9) {
//                continue;
//            }
//            for (int j = 0; j <= 9; j++) {
//                if (j == 4 || j == 9 || i + j == 0) {
//                    continue;
//                }
//                if ((i * 10 + j) == 100) {
//                    shuttleList = shuttleList + i + j + ".";
//                    counter += 1;
//                    break;
//
//                }
//                shuttleList = shuttleList + i + j + ", ";
//                counter += 1;
//            }
//        }

        String shuttleList = "";
        int counter = 0;

        for (int i = 1; ; i++) {

            String numOfShuttle = String.valueOf(i);

            if (numOfShuttle.contains("4") || numOfShuttle.contains("9")) {
                continue;
            }

            counter++;

            if (counter == 100) {
                shuttleList = shuttleList + i;
                break;
            }

            shuttleList = shuttleList + i + ", ";


        }
        System.out.println("Shuttle list: " + shuttleList);
    }
}

