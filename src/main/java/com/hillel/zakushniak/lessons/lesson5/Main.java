package com.hillel.zakushniak.lessons.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ДЗ 6. Counter Strike
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введіть назву першої команди");
        String team1Name = scanner.nextLine();
        System.out.println("використовуючи Enter, введіть кількість очок кожного з п'яти ігроків");
        int player1Team1 = scanner.nextInt();
        int player2Team1 = scanner.nextInt();
        int player3Team1 = scanner.nextInt();
        int player4Team1 = scanner.nextInt();
        int player5Team1 = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Введіть назву другої команди");
        String team2Name = scanner.nextLine();
        System.out.println("використовуючи Enter, введіть кількість очок кожного з п'яти ігроків");
        int player1Team2 = scanner.nextInt();
        int player2Team2 = scanner.nextInt();
        int player3Team2 = scanner.nextInt();
        int player4Team2 = scanner.nextInt();
        int player5Team2 = scanner.nextInt();
        scanner.nextLine();

        double averageFragsTeam1 = (double)(player1Team1 + player2Team1 + player3Team1 + player4Team1 + player5Team1) / 5;
        double averageFragsTeam2 = (double)(player1Team2 + player2Team2 + player3Team2 + player4Team2 + player5Team2) / 5;

        if (averageFragsTeam1 > averageFragsTeam2) {
            System.out.println("Перемогла команда " + team1Name + " набрала " + averageFragsTeam1 + " очків");
        } else if (averageFragsTeam1 < averageFragsTeam2) {
            System.out.println("Перемогла команда " + team2Name + " набрала " + averageFragsTeam2 + " очків");
        } else {
            System.out.println("Маємо бойову нічию, обидві команди набрали по " + averageFragsTeam1 + " очків");
        }
    }
}
