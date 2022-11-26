package com.hillel.zakushniak.lessons.lesson4;

public class Main {
    public static void main(String[] args) {

        // ДЗ 4. Параллелепіпед
        int a = 5;
        int b = 6;
        int c = 7;

        int volume = a * b * c;
        int lenght = 4 * (a + b + c);

        System.out.println("Об'єм паралелепіпеда = " + volume);
        System.out.println("Довжина сторін паралелепіпеда = " + lenght);

        // ДЗ 5. Китайскі династії

        int powerWarriorLi = 13;
        int powerArcherLi = 24;
        int powerRiderLi = 46;
        int soldiersInBandLi = 860;

        int powerWarriorMing = 9;
        int powerArcherMing = 35;
        int powerRiderMing = 12;
        double soldiersInBandMing = 1.5 * soldiersInBandLi;

        double totalAttackLi = soldiersInBandLi * powerWarriorLi + soldiersInBandLi * powerArcherLi + soldiersInBandLi * powerRiderLi;
        double totalAttackMing = soldiersInBandMing * powerWarriorMing  + soldiersInBandMing * powerArcherMing + soldiersInBandMing * powerRiderMing;
        System.out.println();
        System.out.println("Загальна атака армії Лі " + totalAttackLi);
        System.out.println("Загальна атака армії Мінь " + totalAttackMing);


    }
}
