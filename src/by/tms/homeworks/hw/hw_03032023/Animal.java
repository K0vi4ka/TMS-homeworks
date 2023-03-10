package by.tms.homeworks.hw.hw_03032023;

public abstract class Animal {
    protected String picture;
    protected String food;
    protected int hunger;
    protected Boundaries boundaries;
    protected Location location;
    protected static Animal[] animalsArray;

    static {
        animalsArray = new Animal[100];
    }

    public Animal(String picture, String food, int hunger, Boundaries boundaries, Location location) {
        this.picture = picture;
        this.food = food;
        this.hunger = hunger;
        this.boundaries = boundaries;
        this.location = location;
    }

    protected abstract void makeNoize();

    protected abstract void eat();

    protected void sleep() {
        System.out.println("Животное спит");
    }

    ;

    protected abstract void roam();

    public abstract String getInfo(String picture);

    public String getPicture() {
        return picture;
    }

    public static int getArrayIndex() {
        int i = 0;
        while (animalsArray[i] != null) {
            i++;
        }
        return i;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setBoundaries(Boundaries boundaries) {
        this.boundaries = boundaries;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    protected static class Boundaries {
        private int width;
        private int height;

        public Boundaries(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int getWidth() {
            return this.width;
        }

        public int getHeight() {
            return this.height;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int y) {
            this.height = height;
        }

        @Override
        public String toString() {
            return "Boundaries{" +
                    "x = " + this.width +
                    ", y = " + this.height + "}";
        }
    }

    protected static class Location {
        private int x;
        private int y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return "Location{" +
                    "x = " + this.x +
                    ", y = " + this.y + "}";
        }
    }
}
