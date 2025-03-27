package Level_2.model.entities;

import Level_2.model.exceptions.CustomException;

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
                System.out.println("Error. Introduce tu edad");
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
                System.out.println("Error. Introduce un número enter");
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

    // Custom exception

    public static char readChar(String message){
        scanner.nextLine();

        while (true) {
            try {
                System.out.println(message);
                String input = scanner.nextLine();

                if (input.length() == 1) {
                    return input.charAt(0);
                } else {
                    throw new CustomException("Error. Introduce un único caracter");
                }
            } catch (CustomException e) {
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
                    throw new CustomException("Error. Has contestado en blanco. Debes escribir una palabra o frase");
                } else {
                    return input;
                }
            } catch (CustomException e) {
                System.out.println("Error. Introduce una frase o palabra");
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
                    throw new CustomException("Error. Introduce la letra s o la n");
                }
            } catch (CustomException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}