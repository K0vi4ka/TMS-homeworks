package by.tms.homeworks.hw.hw_03032023;

public class Lion extends Feeline {
    public Lion(String picture, String food, int hunger, Boundaries boundaries, Location location) {
        super(picture, food, hunger, boundaries, location);
    }

    @Override
    protected void eat() {
        System.out.println("Лев ест" + this.food);
    }

    @Override
    public String getInfo(String picture) {
        return "Animal: lion," +
                " Picture: " + this.picture +
                ", food: " + this.food +
                ", hunger: " + this.hunger +
                ", boundaries: " + this.boundaries.getHeight() + " , " + this.boundaries.getWidth() +
                ", location: " + this.location.getX() + " , " + this.location.getY();
    }

    @Override
    public void makeNoize() {
        System.out.println("Рычит по львиному");
    }
}
