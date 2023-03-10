package by.tms.homeworks.hw.hw_03032023;

public abstract class Transport {
    protected int power;
    protected int maxSpeed;
    protected float weight;
    protected String brand;

    public Transport(int power, int maxSpeed, float weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public abstract String getCharacteristicsInfo();

    protected double translatePower() {
        return power * 0.74;
    }
}
