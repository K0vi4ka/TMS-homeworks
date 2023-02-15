package by.tms.homeworks.hw.hw_17022023.Switch;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число меньше 10");
        int num = in.nextInt();

        switch (num) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Ошибка, дня недели с таким номером не существует");

        }
    }
}
