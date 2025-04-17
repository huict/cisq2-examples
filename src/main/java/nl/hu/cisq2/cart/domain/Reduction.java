package nl.hu.cisq2.cart.domain;

import java.math.BigDecimal;

public interface Reduction {

    public BigDecimal apply(Customer customer, BigDecimal price);

}
