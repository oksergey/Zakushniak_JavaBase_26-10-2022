package com.hillel.zakushniak.lesson15.HomeWork18;

import com.hillel.zakushniak.lessons.lesson15.HomeWork18.ArrayUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestArrayUtil {


    //if null return -3
    //if empty return -2

    @Test
    public void test1() {
        int[] array = {1, 2, 3};
        double average = ArrayUtil.getAverage(array);
        assertEquals(2, average);
    }

    @Test
    public void test2() {
        int[] array = null;
        double average = ArrayUtil.getAverage(array);
        assertEquals(-3, average);
    }

    @Test
    public void test3() {
        int[] array = {};
        double average = ArrayUtil.getAverage(array);
        assertEquals(-2, average);
    }

    @Test
    public void test4() {
        int[] array = {1, (int) (Math.random() * 11)};
        double average = ArrayUtil.getAverage(array);
        assertNotEquals(0, average);
    }

    @Test
    public void test5() {
        int[] array = {1, (int) (Math.random() * 11)};
        double average = ArrayUtil.getAverage(array);
        System.out.println("Average = " + average);
        assertTrue(average <= 5.5);
    }

    //Matrix
    //if null return -3

    @Test
    public void test6() {
        int[][] array = null;
        int checkForSquare = ArrayUtil.checkForSquare(array);
        assertEquals(-3, checkForSquare);
    }

    //if square -1
    @Test
    public void test7() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int checkForSquare = ArrayUtil.checkForSquare(array);
        assertEquals(-1, checkForSquare);
    }


    //if not square -2
    @Test
    public void test8() {
        int[][] array = {
                {}
        };
        int checkForSquare = ArrayUtil.checkForSquare(array);
        assertEquals(-2, checkForSquare);
    }

    @Test
    public void test9() {
        int[][] array = {
                {1, 2, 3},
                {4, 5},
                {6}
        };
        int checkForSquare = ArrayUtil.checkForSquare(array);
        assertEquals(-2, checkForSquare);
    }


    //if empty 0
    @Test
    public void test10() {
        int[][] array = {};
        int checkForSquare = ArrayUtil.checkForSquare(array);
        assertEquals(0, checkForSquare);
    }

}
