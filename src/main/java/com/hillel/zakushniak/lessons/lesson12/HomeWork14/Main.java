package com.hillel.zakushniak.lessons.lesson12.HomeWork14;

public class Main {
    public static void main(String[] args) {
        FitnessAccount person1 = new FitnessAccount("Ivan", 1856, 8, 27,
                "ivan@gmail.com", "0971234567", "Franko", 60, "120/60", 0);
        System.out.println(person1.printAccountInfo());
        System.out.println();

        FitnessAccount person2 = new FitnessAccount("Taras", 1814, 03, 9, "taras@gmail.com",
                "0449582991", "Shevchenko", 75, "150/80", 1000);
        System.out.println(person2.printAccountInfo());
        System.out.println();

        FitnessAccount person3 = new FitnessAccount("Lesia", 1871, 02, 25, "lesia@gmail.com",
                "044-999-25-31", "Ukrainka", 60, "100/55", 1234);
        System.out.println(person3.printAccountInfo());
        System.out.println();

        person3.stepsInTheDay = 111111;
        person3.weight = 55;
//        person3.name;
//        System.out.println(person3.getAge());

        System.out.println(person3.printAccountInfo());
        System.out.println();


        person2.surName = "Шевченко";
        person2.pressure = "111/66";
        System.out.println(person2.printAccountInfo());


    }
}
