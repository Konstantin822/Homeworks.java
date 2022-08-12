package com.hillel.din.homeworks.homework8;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
//        Сделать два массива из 7-ми цифр, заполненных случайными цифрами (от 0 до 9).
//        Первый массив - это числа загаданные компанией, которая организовывает лотерею.
//        Второй массив - это числа которые угадал игрок.
//        После того как оба массива заполнены цифрами, нужно отсортировать их по возрастанию любым способом.
//        В отсортированных массивах найти количество совпадений, т.е. чисел в двух массивах с одинаковым индексом;
//        Например:first[3] должен быть равен second[3], как показано ниже.
//                Пример вывода в консоль (совпали 1й, 4й и 6й элементы):
//      [0, 1, 4, 5, 5, 8, 9]
//      [1, 1, 2, 3, 5, 6, 9]
//        Количество совпадений: 3


        int[] array1 = new int[7];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.round(Math.random() * 9));
        }
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));


        int[] array2 = new int[7];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.round(Math.random() * 9));
        }
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

        int count = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array1[i] == array2[i])
                count++;
        }
        System.out.println("Совпадений: " + count);
    }
}

