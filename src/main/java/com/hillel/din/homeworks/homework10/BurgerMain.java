package com.hillel.din.homeworks.homework10;

public class BurgerMain {
    public static void main(String[] args) {
        Burger burger1 = new Burger();

        System.out.println();

        Burger burger2 = new Burger("Булочка", "Котлета", "Сыр", "Капуста");

        System.out.println();

        Burger burger3 = new Burger("Булочка", "Котлета", 2, "Сыр", "Капуста", "Майонез");

    }
}
