package Level_2.model.exceptions;

import Level_2.model.entities.ErrorMessages;

public class CharExceptionMessage extends Exception {

    public CharExceptionMessage() {
        super(ErrorMessages.CHAR_ERROR);
    }

}
