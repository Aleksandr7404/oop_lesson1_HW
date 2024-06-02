package less1.practice;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;

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

    public List<Product> getProducts() {
        return products;
    }
}
