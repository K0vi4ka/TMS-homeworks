package by.tms.homeworks.hw.hw_03032023;

public class Tiger extends Feeline {
    public Tiger(String picture, String food, int hunger, Boundaries boundaries, Location location) {
        super(picture, food, hunger, boundaries, location);
    }

    @Override
    protected void eat() {
        System.out.println("Тигр ест" + this.food);
    }

    @Override
    public String getInfo(String picture) {
        return "Animal: tiger, " +
                "Picture: " + this.picture +
                ", food: " + this.food +
                ", hunger: " + this.hunger +
                ", boundaries: " + this.boundaries.getHeight() + " , " + this.boundaries.getWidth() +
                ", location: " + this.location.getX() + " , " + this.location.getY();
    }

    @Override
    public void makeNoize() {
        System.out.println("Рычит по тигриному");
    }
}
