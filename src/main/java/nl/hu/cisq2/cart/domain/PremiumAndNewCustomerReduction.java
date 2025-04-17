package nl.hu.cisq2.cart.domain;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PremiumAndNewCustomerReduction implements Reduction{

    @Override
    public BigDecimal apply(Customer customer, BigDecimal price) {

        BigDecimal percentage = new BigDecimal(100);

        if (customer.hasRecentlyJoined()) {
            percentage = percentage.subtract(new BigDecimal(5));
        }

        if (customer.hasPremiumAccount()) {
            percentage = percentage.subtract(new BigDecimal(10));
        }

        return price
                .multiply(percentage)
                .divide(new BigDecimal(100), RoundingMode.CEILING);
    }
}
