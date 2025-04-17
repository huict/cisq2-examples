package nl.hu.cisq2.cart.domain;

import java.math.BigDecimal;
import java.util.List;

public class Cart {

    private final Customer customer;
    private final List<Product> products;
    private final Reduction reduction;
    private final ShippingCosts shippingCosts;

    public Cart(Customer customer, List<Product> products, Reduction reduction, ShippingCosts shippingCosts) {



        this.customer = customer;
        this.products = products;
        this.reduction = reduction;
        this.shippingCosts = shippingCosts;
    }

    public BigDecimal calculateTotalPrice() {
        BigDecimal basePrice = calculateBasePrice();

        BigDecimal reducedPrice = reduction.apply(customer, basePrice);

        return shippingCosts.apply(customer, reducedPrice);
    }

    /*

     */
    public BigDecimal calculateBasePrice() {
        BigDecimal basePrice = BigDecimal.ZERO;

        for (Product product : products) {
            basePrice = basePrice.add(product.calculatePrice());
        }

        return basePrice;
    }
}
