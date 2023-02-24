package by.tms.homeworks.hw.hw_24022023;


import java.util.Random;

public class NumbersInOrder {
    public static void main(String[] args) {
        Random rand = new Random();
        int firstNumber = rand.nextInt(100, 999);
        int secondNumber = rand.nextInt(100, 999);
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(numberInOrder(firstNumber, secondNumber, " "));
    }

    public static String numberInOrder(int firstNumber, int secondNumber, String result) {
        if (firstNumber == secondNumber) {
            return result;
        }
        if (firstNumber < secondNumber) {
            return firstNumber + result + numberInOrder(firstNumber + 1, secondNumber, result);
        }
        return firstNumber + result + numberInOrder(firstNumber - 1, secondNumber, result);

    }
}
