package com;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Mercedes", LocalDate.of(2020, 1, 1), 1200000, Kuzov.SEDAN);
        Car car2 = new Car("Toyota", LocalDate.of(1999, 1, 1), 220000, Kuzov.KROSSOVER);
        Car car3 = new Car("Mercedes", LocalDate.of(2022, 1, 1), 1200000, Kuzov.UNIVERSAL);

        car1.bodyTypeIdentification();
        System.out.println(car1.determinationYearOfManufacture());
        System.out.println("__________________________");
        car2.bodyTypeIdentification();
        System.out.println(car2.determinationYearOfManufacture());
        System.out.println("__________________________");
        car3.bodyTypeIdentification();
        System.out.println(car3.determinationYearOfManufacture());
        System.out.println("__________________________");
    }
}
