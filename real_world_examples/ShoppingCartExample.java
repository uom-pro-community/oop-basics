import java.util.ArrayList;
import java.util.List;

class Product {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Added: " + product.getName());
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void checkout() {
        System.out.println("Total amount: $" + calculateTotal());
        System.out.println("Order placed successfully.");
    }
}

public class ShoppingCartExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Keyboard", 40));
        cart.addProduct(new Product("Mouse", 20));
        cart.checkout();
    }
}