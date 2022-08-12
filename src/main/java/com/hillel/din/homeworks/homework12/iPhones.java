package com.hillel.din.homeworks.homework12;

public class iPhones implements Smartphones, iOS{
    @Override
    public void call() {
        System.out.println("Calling");
    }

    @Override
    public void sms() {
        System.out.println("Messaging");
    }

    @Override
    public void internet() {
        System.out.println("Surfing");
    }

    @Override
    public void iOS() {
        System.out.println("Loading");
    }
}
