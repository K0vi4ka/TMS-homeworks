package by.tms.homeworks.hw.hw_10032023;

import java.util.Random;

public class Car {
    private String brand;
    private int speed;
    private float price;

    public Car(String brand, int speed, float price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void start() throws CarException {
        Random random = new Random();
        int randomNumber = random.nextInt(1, 20);
        if (randomNumber % 2 == 0) {
            System.out.printf("Автомобиль марки %s завелся\n",this.brand);
        } else {
            throw new CarException("Машина марки "+this.brand +" сгорела");
        }
    }
}
