package com.hillel.din.homeworks.homework6;

public class SpaceShip {
    public static void main(String[] args) {
        ship();
    }

    static void ship() {
        int shuttle = 1;
        int numberShuttle = 1;

        while (shuttle <= 100) {
            if (check(numberShuttle)) {
                System.out.println("number: " + numberShuttle + " - shuttle: " + shuttle);
                shuttle++;
            }
            numberShuttle++;
        }
    }


    static boolean check(int number) {
        int result = number % 10;
        do {
            if (result == 4 || result == 9) {
                return false;
            }
            number /= 10;
            result = number % 10;
        } while (number > 0);
        return true;
    }
}
