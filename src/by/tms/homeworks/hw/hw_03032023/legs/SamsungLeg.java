package by.tms.homeworks.hw.hw_03032023.legs;

public class SamsungLeg implements ILeg {
    private int price;
    private String name;

    public String getName() {
        return name;
    }

    public SamsungLeg(int price) {
        this.price = price;
        this.name = "Samsung";
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void step() {
        System.out.println("Нога от Samsung шагает");
    }

}
