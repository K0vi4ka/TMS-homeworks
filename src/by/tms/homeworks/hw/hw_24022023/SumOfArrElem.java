package by.tms.homeworks.hw.hw_24022023;

import java.util.Random;

public class SumOfArrElem {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(-10, 10);
            System.out.print(arr[i] + " ");
        }

        System.out.println("Сумма равна = " + calculateSum(arr, arr.length - 1));
    }

    public static int calculateSum(int[] arr, int idx) {
        if (idx == 0) {
            return arr[idx];
        }
        return arr[idx] + calculateSum(arr, idx - 1);
    }
}
