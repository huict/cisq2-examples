package nl.hu.cisq2.domain;

import java.util.ArrayList;
import java.util.List;

// This is a shopping cart
public class SCrt {
    private List<Product> theGoods;
    private boolean tx;

    public double whatWillItCostYou(boolean t, double shp) {
        List<Double> dollar_bills_yall = new ArrayList<>();
        if (!t) {
            for (Product g : theGoods) {
                if (t) {
                    continue;
                } else {
                    dollar_bills_yall.add(g.price());
                }
            }
        } else if (t) {
            for (Product g : theGoods) {
                if (!t) {
                    continue;
                } else {
                    dollar_bills_yall.add(g.price() + g.getTaxRate() * g.price());
                }
            }
        }
        double gimme = 0;
        for (Double dollar : dollar_bills_yall) {
            gimme = gimme + dollar;
        }
        return gimme;
    }
}
