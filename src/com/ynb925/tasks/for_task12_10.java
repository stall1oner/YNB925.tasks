package com.ynb925.tasks;

import java.util.Scanner;
/**
 * Задание 12.10  Контрольная работа считается «провальной», если более половины учеников получили неудовлетворительные оценки.
 * Напишите класс, который принимает с клавиатуры число учеников в группе, а затем -оценку каждого ученика.
 * Класс должен определить, была ли контрольная «провальной».
 * ПС в класе может быть и 4-5 человек.
 */

public class for_task12_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во учеников в классе :");
        int pupils = scanner.nextInt();
        int goodMarks = 0;
        int badMarks = 0;

        for (int i = 0; i < pupils; i++) {
            System.out.println("Введите оценку ученика");
            int mark = scanner.nextInt();
            if (mark > 2){
                goodMarks++;
            }
            if (mark <= 2) {
                badMarks++;
            }
        }
        if (goodMarks >= badMarks){
            System.out.println("Контрольная считается успешной");
        }
        if (goodMarks < badMarks){
            System.out.println("Контрольная считается провальной");
        }
    }
}
