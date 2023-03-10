package by.tms.homeworks.hw.hw_03032023;

public class PassengerTransport extends GroundTransport {
    private String bodyType;
    private int passengerCount;

    public PassengerTransport(int power, int maxSpeed, float weight, String brand, int wheelsCount, int fuelFlow, String bodyType, int passengerCount) {
        super(power, maxSpeed, weight, brand, wheelsCount, fuelFlow);
        this.bodyType = bodyType;
        this.passengerCount = passengerCount;
    }
    @Override
    public String getCharacteristicsInfo() {
        return "Мощность: " + this.power + ", максимальная скорость: " + this.maxSpeed + ", масса: " + this.weight +
                ", количетсво колес: " + this.wheelsCount + ", расход топлива: " + this.fuelFlow + ", тип кузова: " + this.bodyType +
                ", количество пассажиров: " + this.passengerCount + ", мощность в кв: " + this.translatePower();
    }

    public void passedDistance(int time) {
        int distance = time * this.maxSpeed;
        System.out.printf("За время %d ч, автомобиль %s," +
                " двигаясь с максимальной скоростью %d км/ч проедет %d" +
                " км и израсходует %d литров топлива.\n", time, this.brand, this.maxSpeed, distance, this.passedFuel(time));
    }

    private int passedFuel(int time) {
        return time * this.fuelFlow;
    }
}
