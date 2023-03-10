package by.tms.homeworks.hw.hw_03032023;

public class CargoTransport extends GroundTransport {
    private float capacity;

    public CargoTransport(int power, int maxSpeed, float weight, String brand, int wheelsCount, int fuelFlow, float capacity) {
        super(power, maxSpeed, weight, brand, wheelsCount, fuelFlow);
        this.capacity = capacity;
    }

    @Override
    public String getCharacteristicsInfo() {
        return "Мощность: " + this.power + ", максимальная скорость: " + this.maxSpeed + ", масса: " + this.weight +
                ", количетсво колес: " + this.wheelsCount + ", расход топлива: " + this.fuelFlow +
                ", грузоподъемонсть: " + this.capacity + ", мощность в кв: " + this.translatePower();
    }

    public void checkTransportCapacity(float cargoWeight) {
        if (cargoWeight >= this.capacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
