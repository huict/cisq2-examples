package nl.hu.cisq2.cart.domain;

import java.math.BigDecimal;

public class RegionBasedShippingCosts implements ShippingCosts {
    @Override
    public BigDecimal apply(Customer customer, BigDecimal price) {

        if (customer.livesInTheNetherlands()) {
            return price.add(BigDecimal.valueOf(5));
        }

        if (customer.livesOutsideEurope()) {
            return price.add(BigDecimal.valueOf(15));
        }

        return price.add(BigDecimal.valueOf(10));
    }
}
