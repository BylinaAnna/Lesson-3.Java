package ru.detmir;

public class Cars {
    String brand;
    String model;
    int year;
    String[] modelMazda = {"CX-6", "CX-4", "CX-5"};

    public Cars(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void findcars(String brand) {
        this.brand = brand;
        if (this.brand == "Mazda") {
            System.out.println("Найдена машина марки " + this.brand);
        } else {
            System.out.println("Не найдена машина марки " + this.brand);
        }
    }

    public void modelcars() {
        for (int i = 0; i < modelMazda.length; i++) {
            System.out.println(modelMazda[i]);
        }
    }
}