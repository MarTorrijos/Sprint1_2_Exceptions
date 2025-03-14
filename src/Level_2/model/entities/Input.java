package Level_2.model.entities;

import Level_2.model.exceptions.BooleanExceptionMessage;
import Level_2.model.exceptions.CharExceptionMessage;
import Level_2.model.exceptions.StringExceptionMessage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private static final Scanner scanner = new Scanner(System.in);

    // InputMismatchExceptions

    public static byte readByte(String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Error. Introduce tu edad. No puede ser de más de dos dígitos");
                scanner.nextLine();
            }
        }
    }

    public static int readInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error. Introduce un número entero");
                scanner.nextLine();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            try {
                System.out.println(message);
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Error. Introduce un número con decimales separados por un punto");
                scanner.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            try {
                System.out.println(message);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error. Introduce un número con decimales separados por un punto");
                scanner.nextLine();
            }
        }
    }

    // Personalized exceptions

    public static char readChar(String message){
        scanner.nextLine();

        while (true) {
            try {
                System.out.println(message);
                String input = scanner.nextLine();

                if (input.length() == 1) {
                    return input.charAt(0);
                } else {
                    throw new CharExceptionMessage();
                }
            } catch (CharExceptionMessage e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static String readString(String message) {
        while (true) {
            try {
                System.out.println(message);
                String input = scanner.nextLine();

                if (input.isEmpty()) {
                    throw new StringExceptionMessage();
                } else {
                    return input;
                }
            } catch (StringExceptionMessage e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static boolean readYesNo(String message) {
        while (true) {
            try {
                System.out.println(message);
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("s")) {
                    return true;
                } else if (input.equalsIgnoreCase("n")) {
                    return false;
                } else {
                    throw new BooleanExceptionMessage();
                }
            } catch (BooleanExceptionMessage e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
