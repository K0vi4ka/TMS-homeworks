package by.tms.homeworks.hw.hw_10032023;

public class LetterEnumMain {
    public static void main(String[] args) {
        System.out.println(getLetterPosition("c"));
    }

    public static int getLetterPosition(String let) {
        return Letter.valueOf(let.toUpperCase()).ordinal() + 1;
    }
}
