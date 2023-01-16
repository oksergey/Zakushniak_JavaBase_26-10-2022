package com.hillel.zakushniak.lessons.lesson15.HomeWork18;

public class ArrayUtil {
//    public static double getAverage;

    //if null return -3
    //if empty return -2


    public static double getAverage(int[] array) {
        if (array == null) {
            return -3;
        }

        if (array.length == 0) {
            return -2;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / (double) array.length;
    }

    public static int checkForSquare(int[][] array) {

        if (array == null) {
            return -3;
        }

        if (array.length == 0) {
            return 0;
        }

        for (int i = 0; i < array.length; i++) {

            if (array[i].length != array.length) {
                return -2;
            }
        }
        return -1;
    }
}
