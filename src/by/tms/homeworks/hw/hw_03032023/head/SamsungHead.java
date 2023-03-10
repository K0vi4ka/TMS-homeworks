package by.tms.homeworks.hw.hw_03032023.head;

public class SamsungHead implements IHead {
    private int price;
    private String name;

    public SamsungHead(int price) {
        this.price = price;
        this.name = "Samsung";
    }

    public String getName() {
        return name;
    }

    @Override
    public void speak() {
        System.out.println("Голова Samsung работает");
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
