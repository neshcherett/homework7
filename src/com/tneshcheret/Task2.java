package com.tneshcheret;

public class Task2 {
    public static void main(String[] args) {
        // Задание 2) Найти количество счастливых билетиков на трамвай от 000001 до 999999 (те у которых сумма первых 3 цифр равна сумме последних 3)

        int leftPart;
        int rightPart;
        int counter = 0;

        for (int i = 0; i < 1000; i++) {
            leftPart = i;
            int sumLeft = (leftPart / 100) + (leftPart / 10 % 10) + (leftPart % 10);
            for (int j = 0; j < 1000; j++) {
                rightPart = j;
                int sumRight = (rightPart / 100) + (rightPart / 10 % 10) + (rightPart % 10);
                if (sumLeft == sumRight) {
                    counter = counter + 1;
                }
            }
        }

        System.out.println("Всего " + counter + " счастлывых билетиков");
    }
}