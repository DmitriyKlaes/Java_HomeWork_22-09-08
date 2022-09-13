package ru.Geekbrains;

/*
Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
*/

import java.util.ArrayList;
import java.util.Random;

public class Task001 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(rnd.nextInt(1, 100));
        int max = list.get(0), min = list.get(0);
        double sum = list.get(0);
        for (int i = 1; i < 10; i++) {
            list.add(rnd.nextInt(1, 100));
            max = maxNumber(max, list.get(i));
            min = minNumber(min, list.get(i));
            sum += list.get(i);
        }
        double averageNumber = average(sum, list.size());
        System.out.println(list);
        System.out.printf("Максимальный элемент: %d\n", max);
        System.out.printf("Минимальный элемент: %d\n", min);
        System.out.printf("Среднее арифметическое: %.1f", averageNumber);
    }
    static Integer maxNumber(int max, int number) {
        if (max < number) max = number;
        return max;
    }
    static Integer minNumber(int min, int number) {
        if (min > number) min = number;
        return min;
    }
    static Double average(double sum, int length) {
        return sum / length;
    }
}
