import less1.practice.Product;
import less1.practice.VendingMachine;
import less1.practice.impl.*;

import java.time.LocalDate;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Product hotdrink1 = new HotDrink("Капучино", 200,LocalDate.of(2024, 6,3),
                95, TypeHotDrink.COFFEE.getDrink(), 0.25F);
        Product hotdrink2 = new HotDrink("Зеленый",50, LocalDate.of(2024,6,3),
                95, TypeHotDrink.TEA.getDrink(),0.3F);


        VendingMachine vmHD = new HotDrinkVendingMachine();
        System.out.println(vmHD.getProducts());
        vmHD.addProducts(List.of(hotdrink1, hotdrink2, hotdrink2, hotdrink1));
        System.out.println(vmHD.getProducts());
        vmHD.getProduct("Капучино", 0.25F, 95);
        System.out.println(vmHD.getProducts());

    }
}
