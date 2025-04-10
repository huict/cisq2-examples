package nl.hu.cisq2.domain;

public record Product(String name, Double price, int quantity) {

    public Double calculatePrice() {
        return price * quantity;
    }

    public Double getTaxRate() {
        return price * 0.05;
    }
}
