package Level_1.model.entities;

import Level_1.model.exceptions.EmptySaleException;

import java.util.ArrayList;

public class Sale {

    // cambiar esto a list, bones practiques
    private ArrayList<Product> products;
    // cambiar a double, el float redondea decimales
    private float totalPrice;

    public Sale() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public float calculateTotal() throws EmptySaleException {
        if (products.isEmpty()) {
            throw new EmptySaleException();
        } else {
            for (Product product : products) {
                totalPrice += product.getPrice();
            }
        }
        return totalPrice;
    }

}