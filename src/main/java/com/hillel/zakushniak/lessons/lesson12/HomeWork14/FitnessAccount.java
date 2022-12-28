package com.hillel.zakushniak.lessons.lesson12.HomeWork14;

public class FitnessAccount {

    private final String name;
    private final int yearBirth;
    private final int monthBirth;
    private final int dayBirth;
    private final String email;
    private final String phone;
    private int age;

    String surName;
    double weight;
    String pressure;
    int stepsInTheDay;

    public FitnessAccount(String name, int yearBirth, int monthBirth, int dayBirth, String email, String phone, String surName, double weight, String pressure, int stepsInTheDay) {
        this.name = name;
        this.yearBirth = yearBirth;
        this.monthBirth = monthBirth;
        this.dayBirth = dayBirth;
        this.email = email;
        this.phone = phone;
        this.surName = surName;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsInTheDay = stepsInTheDay;

        age = 2020 - yearBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public int getMonthBirth() {
        return monthBirth;
    }

    public int getDayBirth() {
        return dayBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String printAccountInfo() {
        return "\t \t" + name + " " + surName + '\n' +
                "Date of Birth (Y/M/D): " + yearBirth + " " + monthBirth + " " + dayBirth + "\n" +
                "age: " + age + '\n' +
                "email: " + email + '\n' +
                "phone: " + phone + '\n' +
                "weight: " + weight + '\n' +
                "pressure: " + pressure + '\n' +
                "stepsInTheDay=" + stepsInTheDay + '\n';
    }


//    @Override
//    public String toString() {
//        return "\t \t" + name + " " + surName + '\n' +
//                "Date of Birth (Y/M/D): " + yearBirth + " " + monthBirth + " " + dayBirth + "\n" +
//                "age: " + age +   '\n' +
//                "email: " + email + '\n' +
//                "phone: " + phone + '\n' +
//                "weight: " + weight + '\n' +
//                "pressure: " + pressure + '\n' +
//                "stepsInTheDay=" + stepsInTheDay +'\n';
//    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public int getStepsInTheDay() {
        return stepsInTheDay;
    }

    public void setStepsInTheDay(int stepsInTheDay) {
        this.stepsInTheDay = stepsInTheDay;
    }
}
