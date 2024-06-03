package less1.practice;

import less1.practice.impl.HotDrink;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    public List<Product> products;

    public VendingMachine() {  // правильная инициализация через конструктор!
        this.products = new ArrayList<>();
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

    public Product getProduct(String name){
        for (Product product: products){
            if(product.getName().equals(name)){
                Product result = product;
                products.remove(product);
                return result;
            }
        }
        throw new RuntimeException("No such product:" + name);
    }

    public Product getProduct(String name, float vol, int temp){
        for (Product prod: products){
            if(prod.getName().equals(name) && ((HotDrink) prod).getVolume() == vol && ((HotDrink) prod).getTemperature() == temp){
                Product result = prod;
                products.remove(prod);
                return result;
            }
        }
        throw new RuntimeException("No such product:" + name);
    }

    public List<Product> getProducts() {
        return products;
    }
}
