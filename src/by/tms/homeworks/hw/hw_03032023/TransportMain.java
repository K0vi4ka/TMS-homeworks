package by.tms.homeworks.hw.hw_03032023;

public class TransportMain {
    public static void main(String[] args) {
        PassengerTransport passengerTransport = new PassengerTransport(10, 200, 2, "BMW", 4, 100, "Универсал", 5);
        CargoTransport cargoTransport = new CargoTransport(20, 250, 2, "Audi", 5, 200, 200);
        MilitaryAirTransport militaryAirTransport = new MilitaryAirTransport(100, 500, 10, "ИС", 50, 100, true, 3);
        CivilAirTransport civilAirTransport = new CivilAirTransport(200, 400, 20, "Boeing", 20, 60, 100, true);

        Transport[] transports = {passengerTransport, cargoTransport, militaryAirTransport, civilAirTransport};
        for (Transport transport : transports) {
            System.out.println(transport.getCharacteristicsInfo());
        }

        passengerTransport.passedDistance(1);
        cargoTransport.checkTransportCapacity(100);
        militaryAirTransport.shoot();
        militaryAirTransport.shoot();
        militaryAirTransport.shoot();
        militaryAirTransport.shoot();
        militaryAirTransport.eject();
        civilAirTransport.checkPassengerCount(50);

    }
}
