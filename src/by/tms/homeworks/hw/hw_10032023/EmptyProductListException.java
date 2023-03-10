package by.tms.homeworks.hw.hw_10032023;

public class EmptyProductListException extends Exception{
    public EmptyProductListException() {
        super("No products found");
    }
}
