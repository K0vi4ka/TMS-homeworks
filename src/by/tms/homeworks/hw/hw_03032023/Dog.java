package by.tms.homeworks.hw.hw_03032023;

public class Dog extends Canine {

    public Dog(String picture, String food, int hunger, Boundaries boundaries, Location location) {
        super(picture, food, hunger, boundaries, location);
    }

    @Override
    protected void makeNoize() {
        System.out.println("Лает");
    }

    @Override
    protected void eat() {
        System.out.println("Собака ест" + this.food);
    }

    @Override
    public String getInfo(String picture) {
        return "Animal: dog, " +
                "Picture: " + this.picture +
                ", food: " + this.food +
                ", hunger: " + this.hunger +
                ", boundaries: " + this.boundaries.getHeight() + " , " + this.boundaries.getWidth() +
                ", location: " + this.location.getX() + " , " + this.location.getY();
    }
}
