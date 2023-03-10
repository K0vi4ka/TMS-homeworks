package by.tms.homeworks.hw.hw_03032023;

public class AnotherAnimal extends Animal {
    public AnotherAnimal(String picture, String food, int hunger, Boundaries boundaries, Location location) {
        super(picture, food, hunger, boundaries, location);
    }

    @Override
    protected void makeNoize() {
        System.out.println("Неизвестный звук");
    }

    @Override
    protected void eat() {
        System.out.println("неизвестная еда");
    }

    @Override
    protected void roam() {
        System.out.println("Гуляет");
    }

    @Override
    public String getInfo(String picture) {
        return
                "Picture: " + this.picture +
                        ", food: " + this.food +
                        ", hunger: " + this.hunger +
                        ", boundaries: " + this.boundaries.getHeight() + " , " + this.boundaries.getWidth() +
                        ", location: " + this.location.getX() + " , " + this.location.getY();
    }
}
