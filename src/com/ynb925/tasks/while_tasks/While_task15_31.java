package com.ynb925.tasks.while_tasks;

import java.util.Scanner;

/**
 * Задание 15.31 Напишите класс, который принимает с клавиатуры
 * серию целых чисел до тех пор, пока количество четных чисел в серии остается меньше 5.
 */
public class While_task15_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int temp = 0;
        int inNum;


        while (temp != 5) {
            inNum = scanner.nextInt();
            if (inNum % 2 == 0){
                temp++;
            }

        }
    }
}

/*    int scan;
    int countIter = 0;

        while (countIter < 5) {
        scan = scanner.nextInt();
        if (scan % 2 == 0) {
        countIter++;
        }
        }
        System.out.println("even nums is < 5 times");
        }
        }*/
