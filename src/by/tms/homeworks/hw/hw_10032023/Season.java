package by.tms.homeworks.hw.hw_10032023;

public enum Season {

    WINTER("Зима"),
    SPRING("Весна"),
    SUMMER("Лето"),
    AUTUMN("Осень");

    private String name;

    Season(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
