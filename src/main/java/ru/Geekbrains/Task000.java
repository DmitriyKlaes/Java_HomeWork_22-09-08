package ru.Geekbrains;

/*
Пусть дан произвольный список целых чисел, удалить из него четные числа
*/

import java.util.ArrayList;
import java.util.Random;

public class Task000 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(0, 30));
        }
        System.out.println(list);
        int index = 0;
        while (index < list.size()) {
            if (list.get(index) % 2 == 0) {
                list.remove(index);
            } else {
                index++;
            }
        }
        System.out.println(list);
    }
}
