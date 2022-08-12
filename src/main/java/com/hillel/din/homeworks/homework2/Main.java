package com.hillel.din.homeworks.homework2;

public class Main {
    public static void main(String[] args) {
        int a = 20;
        int b = 17;
        int c = 14;

        double volume = a * b * c;

        System.out.print("Длина параллелепипеда = " + a);
        System.out.println(" см");
        System.out.print("Ширина параллелепипеда = " + b);
        System.out.println(" см");
        System.out.print("Высота параллелепипеда = " + c);
        System.out.println(" см");
        System.out.print("Объем параллелепипеда = " + volume);
        System.out.println(" куб.см");

        double lenght = (a + b + c) * 4;

        System.out.print("Суммарная длина параллелепипеда = " + lenght);
        System.out.println(" см");

    }
}
