package by.tms.homeworks.hw.hw_03032023;

public abstract class GroundTransport extends Transport {
    protected int wheelsCount;
    protected int fuelFlow;

    public GroundTransport(int power, int maxSpeed, float weight, String brand, int wheelsCount, int fuelFlow) {
        super(power, maxSpeed, weight, brand);
        this.wheelsCount = wheelsCount;
        this.fuelFlow = fuelFlow;
    }
}
