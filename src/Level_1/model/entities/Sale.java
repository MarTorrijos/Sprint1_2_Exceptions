package Level_1.model.entities;

import Level_1.model.exceptions.EmptySaleException;

import java.util.ArrayList;
import java.util.List;

public class Sale {

    private List<Product> products;
    private double totalPrice;

    public Sale() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double calculateTotal() throws EmptySaleException {
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