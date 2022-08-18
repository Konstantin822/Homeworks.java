package com.hillel.din.homeworks.homework14;

public enum DrinksMachine {
    COFFEE("Кофе"),
    TEA("Чай"),
    LEMONADE("Лимонад"),
    MOJITO("Мохито"),
    WATER("Вода"),
    COCA_COLA("Кола");

    private String title;

    DrinksMachine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
