package by.tms.homeworks.hw.hw_03032023;

public class Hippo extends Animal {

    public Hippo(String picture, String food, int hunger, Boundaries boundaries, Location location) {
        super(picture, food, hunger, boundaries, location);
    }

    @Override
    protected void makeNoize() {
        System.out.println("Звук бегемота");
    }

    @Override
    protected void eat() {
        System.out.println("Есть траву");
    }

    @Override
    protected void roam() {
        System.out.println("Гуляет и плавает как бегемот");
    }

    @Override
    public String getInfo(String picture) {
        return "Animal: hippo, " +
                "Picture: " + this.picture +
                ", food: " + this.food +
                ", hunger: " + this.hunger +
                ", boundaries: " + this.boundaries.getHeight() + " , " + this.boundaries.getWidth() +
                ", location: " + this.location.getX() + " , " + this.location.getY();
    }
}
