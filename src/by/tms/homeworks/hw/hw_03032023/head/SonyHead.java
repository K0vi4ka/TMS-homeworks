package by.tms.homeworks.hw.hw_03032023.head;

public class SonyHead implements IHead {
    private int price;
    private String name;

    public SonyHead(int price) {
        this.price = price;
        this.name = "Sony";
    }

    public String getName() {
        return name;
    }


    @Override
    public void speak() {
        System.out.println("Голова Sony работает");
    }

    @Override
    public int getPrice() {
        return this.price;
    }

}
