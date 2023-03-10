package by.tms.homeworks.hw.hw_03032023;

public abstract class Canine extends Animal {

    public Canine(String picture, String food, int hunger, Boundaries boundaries, Location location) {
        super(picture, food, hunger, boundaries, location);
    }

    @Override
    protected void roam() {
        System.out.println("Гуляет в стае");
    }
}