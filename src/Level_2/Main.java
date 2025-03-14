package Level_2;

import static Level_2.model.entities.Input.*;

public class Main {

    public static void main(String[] args) {
        byte age = readByte("Introduce tu edad: ");
        int number = readInt("Introduce un número entero: ");
        float decimal = readFloat("Introduce un número. Puede tener decimales");
        double longDecimal = readDouble("Introduce un número. Puede tener muchos decimales");
        char character = readChar("Introduce un caracter");
        String string = readString("Introduce una palabra o frase: ");
        boolean yesNo = readYesNo("Introduce s (true) o n (false): ");


        System.out.println("El número entero introducido es: " + number
                + "\nTu edad es: " + age
                + "\nEl número introducido es: " + decimal
                + "\nEl número introducido es: " + longDecimal
                + "\nEl caracter es: " + character
                + "\nLa palabra o frase es: " + string
                + "\nHas elegido: " + yesNo);

    }

}
