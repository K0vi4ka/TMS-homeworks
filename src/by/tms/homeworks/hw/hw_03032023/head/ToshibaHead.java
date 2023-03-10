package by.tms.homeworks.hw.hw_03032023.head;

public class ToshibaHead implements IHead {
    private int price;
    private String name;

    public ToshibaHead(int price) {
        this.price = price;
        this.name = "Toshiba";
    }

    public String getName() {
        return name;
    }

    @Override
    public void speak() {
        System.out.println("Голова Toshiba работает");
    }

    @Override
    public int getPrice() {
        return this.price;
    }

}
