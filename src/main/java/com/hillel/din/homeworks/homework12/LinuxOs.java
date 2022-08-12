package com.hillel.din.homeworks.homework12;

public interface LinuxOs {
    default void Linux() {
        System.out.println("Loading");
    }
}
