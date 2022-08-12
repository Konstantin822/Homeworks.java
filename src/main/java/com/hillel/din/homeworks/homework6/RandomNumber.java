package com.hillel.din.homeworks.homework6;

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        Random();
    }
        static void Random() {
            Scanner scanner = new Scanner(System.in);

            int attempts = 3;
            int randomNumber = (int) (Math.random() * 11);
            System.out.println("Введите число от 0 до 10");
            System.out.println("У вас " + attempts + " попытки");


            do {
                if (randomNumber == number(scanner)) {
                    System.out.println("Верно");
                    break;
                } else {
                    attempts--;
                    System.out.println("Неверно, у вас осталось: " + attempts + " попыток");
                }
            } while (attempts > 0);
        }

        static int number (Scanner scanner){
            while(true) {
                if (scanner.hasNextInt()) {
                    int result = scanner.nextInt();
                    if (result >= 0 && result <= 10) {
                        return result;
                    } else {
                        System.out.println("Введите число от 0 до 10");
                    }
                } else {
                    System.out.println("Неправильно. Попробуйте снова");
                    scanner.next();
                }
            }
        }
}

