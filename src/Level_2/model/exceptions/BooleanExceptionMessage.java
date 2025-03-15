package Level_2.model.exceptions;

import Level_2.model.entities.ErrorMessages;

public class BooleanExceptionMessage extends Exception {

    public BooleanExceptionMessage() {
        super(ErrorMessages.BOOLEAN_ERROR);
    }

}
