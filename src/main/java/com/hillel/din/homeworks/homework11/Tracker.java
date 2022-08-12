package com.hillel.din.homeworks.homework11;

public class Tracker {
    public static void main(String[] args) {
        Account customer1 = new Account("Jim", 15, 7, 1995, "Jim@email.com", "546546546",
                "Kirk", 85, 90, 12654);
        customer1.printAccountInfo();

        Account customer2 = new Account("Bob", 26, 3, 2000, "Bob@email.com", "845626845",
                "Anderson", 90, 95, 13568);
        customer2.printAccountInfo();

        Account customer3 = new Account("Jane", 11, 5, 1997, "Jane@email.com", "646457428",
                "Smith", 60, 90, 13247);
        customer3.printAccountInfo();
        customer3.setSurname("Dawn");
        customer3.setWeight(62);
        customer3.setPressure(98);
        customer3.setStepsByDay(11856);
        customer3.printAccountInfo();
    }
}
