package com.hillel.din.homeworks.homework3;

public class Dynasty {
    public static void main(String[] args) {
        int leeArmyWarrior = 13;
        int leeArmyArcher = 24;
        int leeArmyRider = 46;
        int eachClass = 860;

        System.out.println("warrior = " + leeArmyWarrior);
        System.out.println("archer = " + leeArmyArcher);
        System.out.println("rider = " + leeArmyRider);
        System.out.println("eachClass = " + eachClass);

        double totalWarriorStrenght = leeArmyWarrior * eachClass;
        double totalArcherStrenght = leeArmyArcher * eachClass;
        double totalRiderStrenght = leeArmyRider * eachClass;

        System.out.println("Total warrior strenght = " + totalWarriorStrenght);
        System.out.println("Total archer strenght = " + totalArcherStrenght);
        System.out.println("Total rider strenght = " + totalRiderStrenght);

        double totalLeeArmyStrenght = totalWarriorStrenght + totalArcherStrenght + totalRiderStrenght;

        System.out.println("Total Lee army strenght = " + totalLeeArmyStrenght);



        int mingArmyWarrior = 9;
        int mingArmyArcher = 35;
        int mingArmyRider = 12;
        int eachClass2 = 860;
        float outnumbered = 1.5f;

        System.out.println("warrior = " + mingArmyWarrior);
        System.out.println("archer = " + mingArmyArcher);
        System.out.println("rider = " + mingArmyRider);
        System.out.println("Each Class 2 = " + eachClass2);
        System.out.println("outnumbered = " + outnumbered);

        double numbersAdvantage = eachClass2 * outnumbered;

        System.out.println("Numbers advantage = " + numbersAdvantage);

        double totalWarriorStrenght2 = mingArmyWarrior * numbersAdvantage;
        double totalArcherStrenght2 = mingArmyArcher * numbersAdvantage;
        double totalRiderStrenght2 = mingArmyRider * numbersAdvantage;

        System.out.println("Total warrior strenght = " + totalWarriorStrenght2);
        System.out.println("Total archer strenght = " + totalArcherStrenght2);
        System.out.println("Total rider strenght = " + totalRiderStrenght2);

        double totalMingArmyStrenght = totalWarriorStrenght2 + totalArcherStrenght2 + totalRiderStrenght2;

        System.out.println("Total Ming army strenght = " + totalMingArmyStrenght);



    }
}
