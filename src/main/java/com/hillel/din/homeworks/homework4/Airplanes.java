package com.hillel.din.homeworks.homework4;

public class Airplanes {
    public static void main(String[] args) {
        String plane1 = buildAirplane("Jet ", "F52");
        String plane2 = buildAirplane("Boeing ", "747, ", "250");
        String plane3 = buildAirplane("Boeing ", "747, ", "25 ", "250");
        System.out.println(plane1);
        System.out.println(plane2);
        System.out.println(plane3);

    }

    static String buildAirplane(String type, String name) {
        return "Самолет-истребитель: " + type + name;
    }

    static String buildAirplane(String type, String name, String secondClassPassengers) {
        return "Пассажирский без бизнес класса: " + type + name + "пассажиры 2-го класса " + secondClassPassengers + " чел.";
    }

    static String buildAirplane(String type, String name, String firstClassPassengers, String secondClassPassengers) {
        return "Пассажирский с бизнес классом: " + type + name + "пассажиры 1-го класса " + firstClassPassengers + "чел., " + "пассажиры 2-го класса " + secondClassPassengers + " чел.";
    }
}
