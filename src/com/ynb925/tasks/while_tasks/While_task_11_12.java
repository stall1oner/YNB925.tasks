package com.ynb925.tasks.while_tasks;

import java.util.Scanner;
/**
 * Задание 11.12 Напишите класс, который читает с консоли 2 числа и выводит на экран в строку все числа
 * (в возрастающем порядке) с этого диапазона. Числа должны отделяться друг от друга знаком «пробел».
 * Перед началом вывода на экран (в отдельной строке) следует вывести слово Старт,
 * а после окончания вывода чисел (тоже в отдельной строке)-слово Финиш.
 */
public class While_task_11_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1:");
        int value1 = scanner.nextInt();
        System.out.println("Введите число 2:");
        int value2 = scanner.nextInt();


        System.out.println("Старт");
        while (value1 < value2) {
            System.out.println(value1 + " ");
            value1++;

        }
        while (value2 < value1) {
            System.out.println(value2 + " ");
            value2++;
        }
        if (value1 == value2){
            System.out.println(value1 + " ");
        }
        System.out.println("Финиш");
    }
}
