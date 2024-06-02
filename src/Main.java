import less1.practice.Product;
import less1.practice.VendingMachine;
import less1.practice.impl.BootleOffWater;
import less1.practice.impl.EPackage;

import java.time.LocalDate;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Product bottle1 = new BootleOffWater("Родники", 55, LocalDate.of(2024, 5, 1));
        Product bottle2 = new BootleOffWater("Родники Газ", 55, LocalDate.of(2024, 5, 1),
                true, EPackage.GLASS.getMaterial(), 0.5F );

        VendingMachine vm = new VendingMachine();
        System.out.println(vm.getProducts());
        vm.addProducts(List.of(bottle1, bottle1, bottle2, bottle1, bottle2));
        System.out.println(vm.getProducts());
        vm.getProduct("Родники");
        System.out.println(vm.getProducts());

    }
}
