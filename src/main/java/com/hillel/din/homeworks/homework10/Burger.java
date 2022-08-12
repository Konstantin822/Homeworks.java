package com.hillel.din.homeworks.homework10;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;
    int amount = 2;

     Burger() {
        bun = "Булочка";
        meat = "Котлета";
        cheese = "Сыр";
        greens = "Капуста";
        mayonnaise = "Майонез";

        System.out.println("Стандартный бургер: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayonnaise + ".");
    }

     Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;

        System.out.println("Диетический бургер: " + this.bun + ", " + this.meat + ", " + this.cheese + ", " + this.greens + ".");
    }

     Burger(String bun, String meat, int amount, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.amount = amount;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;

        System.out.println("Бургер с двойным мясом: " + this.bun + ", " + this.meat + " " + this.amount + " шт., " + this.cheese + ", " + this.greens + ", " + this.mayonnaise + ".");
    }
}
