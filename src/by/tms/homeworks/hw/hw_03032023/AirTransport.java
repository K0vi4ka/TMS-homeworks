package by.tms.homeworks.hw.hw_03032023;

public abstract class AirTransport extends Transport {
    protected int wingsSize;
    protected float stripeLength;

    public AirTransport(int power, int maxSpeed, float weight, String brand, int wingsSize, float stripeLength) {
        super(power, maxSpeed, weight, brand);
        this.wingsSize = wingsSize;
        this.stripeLength = stripeLength;
    }
}
