package by.tms.homeworks.hw.hw_24022023;

import java.util.Scanner;

public class IsNumberPowerOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int number = in.nextInt();
        System.out.println(powerOfTwo(number));
    }

    public static String powerOfTwo(int num) {
        if (num == 1) {
            return "Yes";
        }
        if (num % 2 != 0) {
            return "No";
        }
        return powerOfTwo(num / 2);
    }
}
