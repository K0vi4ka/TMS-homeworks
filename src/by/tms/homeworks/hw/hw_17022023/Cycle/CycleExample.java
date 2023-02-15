package by.tms.homeworks.hw.hw_17022023.Cycle;

public class CycleExample {
    public static void main(String[] args) {
        for(int i = 1; i < 21;i++) {
            System.out.print('*');
            if(i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
