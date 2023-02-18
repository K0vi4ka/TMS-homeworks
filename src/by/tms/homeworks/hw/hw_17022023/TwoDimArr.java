package by.tms.homeworks.hw.hw_17022023;

import java.util.Random;
import java.util.Scanner;

public class TwoDimArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Введите длинну массива");
        int n = in.nextInt();
        int[][] arr = new int[n][n];

        System.out.println("Исходный массив");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = rand.nextInt(10);
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 == 0) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                }
            }
        }

        System.out.println("Полученный массив массив");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
