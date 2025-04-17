package nl.hu.cisq2.cart.domain;

import java.math.BigDecimal;

public class Product {

    private final String name;
    private final BigDecimal price;
    private final int quantity;

    public Product(String name, BigDecimal price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public BigDecimal calculatePrice() {
        return price.multiply(BigDecimal.valueOf(quantity));
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
