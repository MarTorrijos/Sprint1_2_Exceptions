package DNF_Level_3.model.entities;

public class Menu {

    public static String printMenu() {
        return """
                Selecciona una opción:
                1 - Mostrar butacas reservadas
                2 - Mostrar butacas reservadas por una persona
                3 - Reservar una butaca
                4 - Anular reserva de butaca
                5 - Anular todas las reservas de una persona
                0 - Salir
                """;
    }

}
