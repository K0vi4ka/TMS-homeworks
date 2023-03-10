package by.tms.homeworks.hw.hw_03032023;

public class MilitaryAirTransport extends AirTransport {
    private boolean ejectionSystem;
    private int rocketCount;

    public MilitaryAirTransport(int power, int maxSpeed, float weight, String brand, int wingsSize, float stripeLength, boolean ejectionSystem, int rocketCount) {
        super(power, maxSpeed, weight, brand, wingsSize, stripeLength);
        this.ejectionSystem = ejectionSystem;
        this.rocketCount = rocketCount;
    }

    @Override
    public String getCharacteristicsInfo() {
        return "Мощность: " + this.power + ", максимальная скорость: " + this.maxSpeed + ", масса: " + this.weight +
                ", размер крыльев: " + this.wingsSize + ", минимальная взлетно-посадочная полоса: " + this.stripeLength +
                ", количетсво ракет: " + this.rocketCount + ", наличие системы катапультирования: " + this.ejectionSystem +
                ", мощность в кв: " + this.translatePower();
    }

    public void shoot() {
        if (this.rocketCount == 0) {
            System.out.println("Боеприпасы отсутствуют");
        } else {
            --this.rocketCount;
            System.out.println("Ракета пошла");
        }
    }

    public void eject() {
        if (this.ejectionSystem) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У Вас нет такой системы");
        }
    }
}
