package by.tms.homeworks.hw.hw_17022023.JagArr;

import java.util.Random;

public class JagArrExample {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] arr = new int[5][];

        for(int i = 0; i < arr.length;i++) {
            int j = rand.nextInt(3,10);
            arr[i] = new int[j];
            for(int k = 0; k < j;k++) {
                arr[i][k] = rand.nextInt(10);
            }
        }

        System.out.println("Зубчатый массив");
        for(int i = 0; i < arr.length;i++) {
            for(int j = 0; j < arr[i].length;j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
