interface Coffee {
    String getDescription();
    double getCost();
}

class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple coffee";
    }

    @Override
    public double getCost() {
        return 2.00;
    }
}

class MilkDecorator implements Coffee {
    private final Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.50;
    }
}

public class DecoratorExample {
    public static void main(String[] args) {
        Coffee coffee = new MilkDecorator(new SimpleCoffee());
        System.out.println(coffee.getDescription());
        System.out.println("Cost: $" + coffee.getCost());
    }
}
