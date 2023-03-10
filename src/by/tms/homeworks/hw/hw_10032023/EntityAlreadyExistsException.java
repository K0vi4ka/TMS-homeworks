package by.tms.homeworks.hw.hw_10032023;

public class EntityAlreadyExistsException extends Exception{
    EntityAlreadyExistsException() {
        super("The product exists");
    }
}
