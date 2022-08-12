package com.hillel.din.homeworks.homework7;

import java.util.Arrays;

public class Rugby {
    public static void main(String[] args) {

//        Есть две команды регби из 25 игроков разного возраста в каждой.
//        Возраст берем случайным образом в диапазоне от 18 до 40.
//        Выведите в двух строках возраст игроков каждой команды.
//        Посчитайте средний возраст игроков каждой команды и выведите на экран.

        int min = 18;
        int max = 22;

        int[] team1 = new int[25];
        int sum1 = 0;
        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) Math.round((Math.random() * max) + min);
            sum1 += team1[i];
        }
        System.out.println(Arrays.toString(team1));

        double avg1 = (double) sum1 / 25;
        System.out.println("Average age = " + avg1);


        int[] team2 = new int[25];
        int sum2 = 0;
        for (int i = 0; i < team2.length; i++) {
            team2[i] = (int) Math.round((Math.random() * max) + min);
            sum2 += team2[i];

        }
        System.out.println(Arrays.toString(team2));

        double avg2 = (double) sum2 / 25;
        System.out.println("Average age = " + avg2);

    }
}
