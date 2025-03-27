package DNF_Level_3.model.entities;

import java.util.Scanner;

// CORREGIR ESTO
// ES LO QUE HABÍA EN EL MAIN Y LO HE COPIADO TAL CUAL, pero no está como toca (dividirlo)

public class Theater {

    public static void Initiate() {

        Scanner scanner = new Scanner(System.in);
        int input;

        System.out.print("Cuantas filas tiene la sala? ");
        int rowNum = scanner.nextInt();
        System.out.print("Y cuantos asientos por fila? ");
        int seatNum = scanner.nextInt();

        do {
            System.out.println(Menu.printMenu());
            input = scanner.nextInt();

            MenuSelection.Selected(rowNum, seatNum, input);
        } while (input != 0);
    }


}
