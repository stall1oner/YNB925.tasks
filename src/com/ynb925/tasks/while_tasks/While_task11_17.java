package com.ynb925.tasks.while_tasks;
/**
 * Задание 11.17 Напишите класс, который выводит на экран в строку положительные трехзначные числа, заканчивающиеся
 * на 7 (в возрастающем порядке). Числа должны отделяться друг от друга знаком «пробел».
 */
public class While_task11_17 {
    public static void main(String[] args) {
        int value = 97;
        do {
            value += 10;  // value = value + 10;
            System.out.print(value + " ");
        }while (value <= 987);

    }
}
