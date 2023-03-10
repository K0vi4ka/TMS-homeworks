package by.tms.homeworks.hw.hw_03032023.hands;

public class SamsungHand implements IHand {
    private int price;
    private String name;

    public String getName() {
        return name;
    }

    public SamsungHand(int price) {
        this.price = price;
        this.name = "Samsung";
    }


    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void upHand() {
        System.out.println("Руки от Samsung поднялись");
    }

}
