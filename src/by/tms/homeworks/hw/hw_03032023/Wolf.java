package by.tms.homeworks.hw.hw_03032023;

public class Wolf extends Canine {

    public Wolf(String picture, String food, int hunger, Boundaries boundaries, Location location) {
        super(picture, food, hunger, boundaries, location);
    }

    @Override
    protected void makeNoize() {
        System.out.println("Рычит по волчьи");
    }

    @Override
    protected void eat() {
        System.out.println("Волк ест" + this.food);
    }

    @Override
    public String getInfo(String picture) {
        return "Animal: wolf, " +
                "Picture: " + this.picture +
                ", food: " + this.food +
                ", hunger: " + this.hunger +
                ", boundaries: " + this.boundaries.getHeight() + " , " + this.boundaries.getWidth() +
                ", location: " + this.location.getX() + " , " + this.location.getY();
    }
}
