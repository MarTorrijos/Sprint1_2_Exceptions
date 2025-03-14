package Level_1.model.exceptions;

public class EmptySaleException extends Exception {

    public EmptySaleException() {
        super("To make a sale you have to add products first");
    }

}