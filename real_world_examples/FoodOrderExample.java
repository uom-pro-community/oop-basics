import java.util.ArrayList;
import java.util.List;

class MenuItem {
    private final String name;
    private final double price;

    public MenuItem(String name, double price) {
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

class Restaurant {
    private final String name;
    private final List<MenuItem> menu = new ArrayList<>();

    public Restaurant(String name) {
        this.name = name;
    }

    public void addItem(MenuItem item) {
        menu.add(item);
    }

    public MenuItem findItem(String itemName) {
        for (MenuItem item : menu) {
            if (item.getName().equals(itemName)) {
                return item;
            }
        }
        return null;
    }

    public void showMenu() {
        System.out.println(name + " menu:");
        for (MenuItem item : menu) {
            System.out.println(item.getName() + ": $" + item.getPrice());
        }
    }
}

class FoodOrder {
    private final String customer;
    private final Restaurant restaurant;
    private final List<MenuItem> items = new ArrayList<>();

    public FoodOrder(String customer, Restaurant restaurant) {
        this.customer = customer;
        this.restaurant = restaurant;
    }

    public void addItem(String itemName) {
        MenuItem item = restaurant.findItem(itemName);
        if (item != null) {
            items.add(item);
            System.out.println("Added " + item.getName() + " to the order.");
        } else {
            System.out.println("Item not found on the menu.");
        }
    }

    public double total() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void placeOrder() {
        System.out.println(customer + "'s order total: $" + total());
        System.out.println("Order placed successfully.");
    }
}

public class FoodOrderExample {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Java Cafe");
        restaurant.addItem(new MenuItem("Pizza", 12));
        restaurant.addItem(new MenuItem("Juice", 4));
        restaurant.showMenu();

        FoodOrder order = new FoodOrder("Alex", restaurant);
        order.addItem("Pizza");
        order.addItem("Juice");
        order.placeOrder();
    }
}