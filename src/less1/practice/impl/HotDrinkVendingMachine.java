package less1.practice.impl;

import less1.practice.Product;
import less1.practice.VendingMachine;

import java.util.List;

public class HotDrinkVendingMachine extends VendingMachine {

    public HotDrinkVendingMachine() {
    }

    public HotDrinkVendingMachine(List<Product> products) {
        super(products);
    }
}
