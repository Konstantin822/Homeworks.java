package com.hillel.din.homeworks.homework14;

public enum DrinksMachine {
    COFFEE("����"),
    TEA("���"),
    LEMONADE("�������"),
    MOJITO("������"),
    WATER("����"),
    COCA_COLA("����");

    private String title;

    DrinksMachine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
