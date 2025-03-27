package DNF_Level_3.model.entities;

public class MenuSelection {

    public static void Selected(int rowNum, int seatNum, int input) {

        String answer = "";

        switch (input) {
            case 1:
                System.out.println("Butacas reservadas");
                // print butacas reservadas
                // answer
                break;
            case 2:
                // comprobar primero si alguien ha reservado?
                // Si nadie ha reservado no se hace print del siguiente mensaje
                System.out.println("De qué persona quieres ver las butacas reservadas?");
                // scanner
                // code
                // answer
                break;
            case 3:
                System.out.println("Dime la fila en la que quieres reservar la butaca");
                // scanner
                // code
                System.out.println("Y ahora la columna");
                // scanner
                // code
                // answer
                break;
            case 4:
                System.out.println("Qué reserva quieres anular");
                // scanner
                // code
                // answer
                break;
            case 5:
                System.out.println("Dime el nombre de la persona a la que quieres anular las reservas");
                // scanner
                // code
                // answer
                break;
            case 0:
                answer = "Deu!";
                break;
            default:
                answer = "Número incorrecto, introduce un número del 0-5";
        }

        System.out.println(answer);

    }
}
