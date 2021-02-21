package com.tneshcheret;

public class Task1 {

    public static void main(String[] args) {
	 /*
        Задание 1) Электронные часы показывают время в формате от 00:00 до 23:59.
         Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация для той, что справа от двоеточия.
        */
        int[] hours = new int[2];
        int[] minutes = new int[2];
        int coincidenceCounter = 0;

        for (int i = 0; i < 3; i++) {
            hours[0] = i;
            for (int j = 0; j < 10; j++) {
                if (i == 2 & j == 4) {
                    break;
                }
                hours[1] = j;
                for (int k = 0; k < 6; k++) {
                    minutes[0] = k;
                    for (int n = 0; n < 10; n++) {
                        minutes[1] = n;

                        if (hours[0] == minutes[1] && hours[1] == minutes[0]) {
                            coincidenceCounter++;
                        }
                    }
                }
            }
        }

        System.out.println("За сутки случается " + coincidenceCounter + " совпадений");
    }
}
