package by.tms.homeworks.hw.hw_17022023.Vector;

import java.util.Random;
import java.util.Scanner;

public class Vector {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Введите количество элементов в массиве");
        int count = in.nextInt();
        float[] arr = new float[count];


        for(int i = 0;i < count;i++){
            arr[i] = rand.nextFloat(-10,10);
        }

        int min = 0;
        int max = 0;
        float sum = 0;
        float mult = 1;

        for(int i = 0;i < count;i++){
            if(arr[i] < arr[min]) {
                min = i;
            }
            if(arr[i] > arr[max]) {
                max = i;
            }
        }
        for(int i = 0; i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }

        if(max < min) {
            int buff = min;
            min = max;
            max = buff;
        }

        for(int i = min; i < max;i++) {
            mult*= arr[i];
            if(arr[i] < 0) {
                sum+=arr[i];
            }
        }

        System.out.println("\nРезультат вычислений");
        System.out.format("Произведение = %f \n",mult);
        System.out.format("Сумма равна = %f",sum);


    }
}
