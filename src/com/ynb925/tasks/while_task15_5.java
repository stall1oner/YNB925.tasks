package com.ynb925.tasks;

import java.util.Scanner;

/**
 * Задание 15.5  Напишите класс, который принимает с клавиатуры числа,
 * пока не будет введено значение 999.
 * Класс должен подсчитать, сколько значений было введено с клавиатуры
 * (не считая значения 999), и вывести эту информацию на экран.
 */
public class while_task15_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число :");
        int value1 = scanner.nextInt();
        int value2 = 0;
        int rightValue = 999;

        if (value1 != rightValue) {
            do {
                value2++;
                scanner.nextInt();
            } while (value1 == rightValue);

        }else System.out.println(value2);
    }
}