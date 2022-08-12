package com.hillel.din.homeworks.homework12;

public class Main {
    public static void main(String[] args) {
        Android android = new Android();
        android.call();
        android.sms();
        android.internet();
        android.Linux();

        System.out.println();

        iPhones iphones = new iPhones();
        iphones.call();
        iphones.sms();
        iphones.internet();
        iphones.iOS();
    }
}
