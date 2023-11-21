package com;

import java.time.LocalDate;

public class Car {

    private String mark;
    private LocalDate yearOfIssue;
    private double price;
    private Kuzov kuzov;

    public Car(String mark, LocalDate yearOfIssue, double price, Kuzov kuzov) {
        this.mark = mark;
        this.yearOfIssue = yearOfIssue;
        this.price = price;
        this.kuzov = kuzov;
    }

    public void bodyTypeIdentification() {
        if (this.kuzov.equals(Kuzov.SEDAN) || this.kuzov.equals(Kuzov.HETCHBEK)) {
            System.out.println("Женил машина!");
        } else if (this.kuzov.equals(Kuzov.VNEDOROJNIK) || this.kuzov.equals(Kuzov.KROSSOVER)) {
            System.out.println("Оор машина!");
        } else {
            System.out.println("Универсал машина!");
        }
    }

    public int determinationYearOfManufacture() {

        int year = LocalDate.now().getYear() - this.yearOfIssue.getYear();
        return year;
    }

}
