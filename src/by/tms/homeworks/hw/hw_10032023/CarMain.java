package by.tms.homeworks.hw.hw_10032023;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Жигуль", 200, 100);
        Car car2 = new Car("Мерседес", 180, 3300);
        Car car3 = new Car("БМВ", 190, 2000);
        Car car4 = new Car("Ауди", 170, 1500);
        Car[] cars = {car1, car2, car3, car4};
        for (Car car : cars) {
            try {
                car.start();
            } catch (CarException e) {
                System.out.println(e);
            }
        }
    }
}
