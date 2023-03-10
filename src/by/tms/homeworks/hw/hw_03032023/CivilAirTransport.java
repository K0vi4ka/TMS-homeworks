package by.tms.homeworks.hw.hw_03032023;

public class CivilAirTransport extends AirTransport {
    private int passengerCount;
    private boolean businessClass;

    public CivilAirTransport(int power, int maxSpeed, float weight, String brand, int wingsSize, float stripeLength, int passengerCount, boolean businessClass) {
        super(power, maxSpeed, weight, brand, wingsSize, stripeLength);
        this.passengerCount = passengerCount;
        this.businessClass = businessClass;
    }

    @Override
    public String getCharacteristicsInfo() {
        return "Мощность: " + this.power + ", максимальная скорость: " + this.maxSpeed + ", масса: " + this.weight +
                ", размер крыльев: " + this.wingsSize + ", минимальная взлетно-посадочная полоса: " + this.stripeLength +
                ", количетсво пассажиров: " + this.passengerCount + ", наличие бизнес-класса: " + this.businessClass +
                ", мощность в кв: " + this.translatePower();
    }

    public void checkPassengerCount(int passengerCount) {
        if (this.passengerCount <= passengerCount) {
            System.out.println("Все пассажиры поместились в самолет");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }
}
