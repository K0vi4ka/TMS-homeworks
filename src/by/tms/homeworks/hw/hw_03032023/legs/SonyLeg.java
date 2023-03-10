package by.tms.homeworks.hw.hw_03032023.legs;

public class SonyLeg implements ILeg {
    private int price;
    private String name;

    public SonyLeg(int price) {
        this.price = price;
        this.name = "Sony";
    }

    public String getName() {
        return name;
    }

    @Override
    public void step() {
        System.out.println("Нога от Sony шагает");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
