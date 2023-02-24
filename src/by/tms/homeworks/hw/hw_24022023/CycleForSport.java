package by.tms.homeworks.hw.hw_24022023;

public class CycleForSport {
    public static void main(String[] args) {
        float resultDist = 10;
        float norm = 10;
        for (int i = 0; i < 7; i++) {
            norm += norm * 0.1;
            resultDist += norm;
        }

        System.out.printf("Итоговое расстояние, которое пробежал спротсмен %.2f", resultDist);
    }
}
