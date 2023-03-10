package by.tms.homeworks.hw.hw_10032023;

public class EmptyNotFoundException extends Exception{
    public EmptyNotFoundException(int id){
        super("Product with id = "+id+" not found");
    }
}
