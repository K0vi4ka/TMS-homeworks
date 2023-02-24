package by.tms.homeworks.hw.hw_24022023;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String typeOfProc;
    private int amountOfRam;
    private int amountOfHdd;
    private boolean computerState;
    private Random random = new Random();
    private Scanner in = new Scanner(System.in);

    public Computer() {
        this.typeOfProc = "intel core i3";
        this.amountOfRam = 16;
        this.amountOfHdd = 512;
        this.computerState = true;
    }

    public void getComputerInfo() {
        System.out.printf("Тип процессора: %s, объем оперативной памяти: %dгб, объем жеткого диска %dгб\n", typeOfProc, amountOfRam, amountOfHdd);
    }

    public void computerOn() {
        checkUserTry();
        if (computerState) {
            System.out.println("Вы успешно включили в компьютер");
        } else {
            System.out.println("Ошибка, компьютер сгорел");
        }
    }

    public void computerOff() {
        checkUserTry();
        if (computerState) {
            System.out.println("Вы успешно выключили компьютер");
        } else {
            System.out.println("Ошибка, компьютер сгорел");
        }
    }

    private void checkUserTry() {
        if (computerState) {
            int computerNum = random.nextInt(0, 2);
            System.out.println("Введите число 0 или 1");
            int usersNum = in.nextInt();
            computerState = usersNum == computerNum;
        }
    }

    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.computerOn();
        comp.getComputerInfo();
        comp.computerOff();
        comp.computerOn();
    }
}
