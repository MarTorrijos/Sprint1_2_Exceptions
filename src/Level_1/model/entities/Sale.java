package Level_1.model.entities;

import Level_1.model.exceptions.EmptySaleException;

import java.util.ArrayList;

public class Sale {

    private ArrayList<Product> products;
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
            totalPrice = 0;
            for (Product product : products) {
                totalPrice += product.getPrice();
            }
        }
        return totalPrice;
    }

}