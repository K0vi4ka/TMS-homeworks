package by.tms.homeworks.hw.hw_03032023.legs;

public class ToshibaLeg implements ILeg {
    private int price;
    private String name;

    public ToshibaLeg(int price) {
        this.price = price;
        this.name = "Toshiba";
    }

    public String getName() {
        return name;
    }

    @Override
    public void step() {
        System.out.println("Нога от Toshiba шагает");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
