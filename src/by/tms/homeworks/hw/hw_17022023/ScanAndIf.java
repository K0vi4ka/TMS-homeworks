package by.tms.homeworks.hw.hw_17022023;

import java.util.Scanner;

public class ScanAndIf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len, height, radius;
        System.out.println("Введите следующие переменные");
        System.out.print("Длинна прямоугольника = ");
        len = in.nextInt();
        System.out.print("Ширина прямоугольника = ");
        height = in.nextInt();
        System.out.print("Радиус круга = ");
        radius = in.nextInt();

        if (Math.sqrt(Math.pow(len, 2) + Math.pow(height, 2)) < radius * 2) {
            System.out.println("Круг полностью перекроет прямоугольник");
        } else {
            System.out.println("Круг не перекрывает прямоугольник");
        }


    }
}
