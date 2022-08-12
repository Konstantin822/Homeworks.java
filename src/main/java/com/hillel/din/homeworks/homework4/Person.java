package com.hillel.din.homeworks.homework4;

import javax.swing.event.TreeWillExpandListener;

public class Person {
    public static void main(String[] args) {
        String personInfo = personInfo("Will ", "Smith", "New York", 2936729462846l);
        String personInfo2 = personInfo("Jackie ", "Chan", "Shanghai", 12312412412l);
        String personInfo3 = personInfo("Sherlock ", "Holmes", "London", 37742123513l);
        System.out.println(personInfo);
        System.out.println(personInfo2);
        System.out.println(personInfo3);

    }

    static String personInfo(String name, String surname, String city, long phoneNumber) {
        return "Позвонить гражданину " + name + surname + " из города " + city + " можно по номеру " + phoneNumber;
    }

}
