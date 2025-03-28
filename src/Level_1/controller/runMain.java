package Level_1.controller;

import Level_1.model.entities.Product;
import Level_1.model.entities.Sale;
import Level_1.model.exceptions.EmptySaleException;

public class runMain {

    public static void run() {

        Sale sales = new Sale();

        // Will return empty since there are no products in the list
        try {
            sales.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        sales.getProducts().add(new Product("Pillow", 12));
        sales.getProducts().add(new Product("Blanket", 23));

        // Will return calculateTotal
        try {
            sales.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Total price of the sale " + sales.getTotalPrice());

        try {
            System.out.println(sales.getProducts().get(3));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

}
