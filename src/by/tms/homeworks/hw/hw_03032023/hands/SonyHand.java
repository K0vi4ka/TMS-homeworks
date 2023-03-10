package by.tms.homeworks.hw.hw_03032023.hands;

public class SonyHand implements IHand {
    private int price;
    private String name;

    public SonyHand(int price) {
        this.price = price;
        this.name = "Sony";
    }

    public String getName() {
        return name;
    }

    @Override
    public void upHand() {
        System.out.println("Руки от Sony поднялись");
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
