package com.hillel.zakushniak.lessons.lesson9;

import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {

        int M, N;

        do {


            System.out.print("Please enter the size of the matrix M = ");

            Scanner input = new Scanner(System.in);
            while (true) {

                if (input.hasNextInt()) {
                    M = input.nextInt();
                    input.nextLine();
                    if (M < 0) {
                        System.out.println("Please enter positive number!");
                        continue;
                    }
                    break;

                } else {
                    System.out.println("Wrong data! Try again!");
                    input.nextLine();
                }
            }

            System.out.print("Please enter the size of the matrix N = ");

            while (true) {

                if (input.hasNextInt()) {
                    N = input.nextInt();
                    input.nextLine();
                    if (N < 0) {
                        System.out.println("Please enter positive number!");
                        continue;
                    }
                    break;
                } else {
                    System.out.println("Wrong data! Try again!");
                    input.nextLine();
                }

            }

            if (M == 0 || N == 0) {
                System.out.println("Matrix is empty! There is nothing to transpose :(");
                System.out.println();
            } else break;
        } while (true);

        int[][] matrix1 = new int[M][N];
        int[][] matrix2 = new int[N][M];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = (int) (Math.random() * 10);

            }

        }

        System.out.println("Matrix M x N:");

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {

                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++)
                matrix2[i][j] = matrix1[j][i];

        }

        System.out.println("Matrix N x M:");

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++)
                System.out.print(matrix2[i][j] + "\t");

            System.out.println();
        }
    }
}