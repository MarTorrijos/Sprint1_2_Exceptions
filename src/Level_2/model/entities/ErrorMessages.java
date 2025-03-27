package Level_2.model.entities;

public class ErrorMessages {

    // Añadir más mensajes para contemplar todos los distintos casos (que si la edad es negativa, etc)

    // Input Mismatch Errors
    public static final String BYTE_ERROR = "Error. Introduce tu edad";
    public static final String INTEGER_ERROR = "Error. Introduce un número entero";
    public static final String FLOAT_ERROR = "Error. Introduce un número con decimales separados por un punto";
    public static final String DOUBLE_ERROR = "Error. Introduce un número con decimales separados por un punto";

    // Personalized Exceptions
    public static final String CHAR_ERROR = "Error. Introduce un único caracter";
    public static final String BOOLEAN_ERROR = "Error. Introduce la letra s o la n";
    public static final String STRING_ERROR = "Error. Introduce una frase o palabra";

}