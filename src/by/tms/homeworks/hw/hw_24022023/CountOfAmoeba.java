package by.tms.homeworks.hw.hw_24022023;

public class CountOfAmoeba {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 3; i <= 24; i += 3) {
            count *= 2;
            System.out.printf("Через %d часа количество амеб будет равно %d\n", i, count);
        }
    }
}
