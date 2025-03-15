package Level_2.model.exceptions;

import Level_2.model.entities.ErrorMessages;

public class StringExceptionMessage extends Exception {

    public StringExceptionMessage() {
        super(ErrorMessages.STRING_ERROR);
    }

}
