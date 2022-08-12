package com.hillel.din.homeworks.homework12;

public class Android implements Smartphones, LinuxOs{

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
    public void Linux() {
        System.out.println("Loading");
    }
}

