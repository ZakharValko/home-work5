package ua.alevel.homeWork5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        // Создаем и наполняем массив
        int[][] array = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        // Выводим изначальный массив
        for (int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array[i]));
        }

        System.out.println("Изменяю массив...");

        changeRowsAndCells(array);

        // Выводим измененный массив
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

    }

    // Меняем столбцы со строками
    public static void changeRowsAndCells(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int box = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = box;
            }
        }
    }
}
