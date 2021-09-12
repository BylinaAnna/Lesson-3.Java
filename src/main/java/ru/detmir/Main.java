package ru.detmir;

public class Main {
    public static void main(String[] args) {
        Cars newfind = new Cars("CX-6", 2016);
        Cars newfind1 = new Cars("CX-4", 2017);
        Cars newfind2 = new Cars("CX-5", 2018);

        newfind.findcars("Mazda");
        System.out.println("Найдена модель:" + newfind.model + " Год выпуска:" + newfind.year);

        newfind1.findcars("Toyota");

        newfind2.findcars("Mazda");
        System.out.println("Найдена модель:" + newfind2.model + " Год выпуска:" + newfind2.year);

        System.out.println("Итого найдены следующие модели: ");
        newfind.modelcars();
    }


}
