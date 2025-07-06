import java.util.*;

public class Store {
    private List<Product> productList = new ArrayList<>();

    public Store() {
        productList.add(new Product(1, "Laptop", 45000));
        productList.add(new Product(2, "Headphones", 1500));
        productList.add(new Product(3, "Smartphone", 18000));
        productList.add(new Product(4, "Smartwatch", 3500));
    }

    public void displayProducts() {
        System.out.println("\n📦 Available Products:");
        for (Product p : productList) {
            p.display();
        }
    }

    public Product getProductById(int id) {
        for (Product p : productList) {
            if (p.getId() == id) return p;
        }
        return null;
    }
}
