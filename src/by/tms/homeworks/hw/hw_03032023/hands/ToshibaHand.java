package by.tms.homeworks.hw.hw_03032023.hands;

public class ToshibaHand implements IHand {
    private int price;
    private String name;

    public ToshibaHand(int price) {
        this.price = price;
        this.name = "Toshiba";
    }

    public String getName() {
        return name;
    }

    @Override
    public void upHand() {
        System.out.println("Руки от Toshiba поднялись");
    }

    @Override
    public int getPrice() {
        return this.price;
    }


}
