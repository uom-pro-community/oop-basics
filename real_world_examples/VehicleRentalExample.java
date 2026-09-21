abstract class Vehicle {
    private final String model;
    private final double dailyRate;
    private boolean available = true;

    protected Vehicle(String model, double dailyRate) {
        this.model = model;
        this.dailyRate = dailyRate;
    }

    public String getModel() {
        return model;
    }

    public void rent(int days) {
        if (!available) {
            System.out.println(model + " is already rented.");
            return;
        }
        available = false;
        System.out.println(model + " rented for " + days + " days: $" + dailyRate * days);
    }

    public void returnVehicle() {
        available = true;
        System.out.println(model + " returned successfully.");
    }

    public abstract void describe();
}

class Car extends Vehicle {
    public Car(String model, double dailyRate) {
        super(model, dailyRate);
    }

    @Override
    public void describe() {
        System.out.println("Car: " + getModel());
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String model, double dailyRate) {
        super(model, dailyRate);
    }

    @Override
    public void describe() {
        System.out.println("Motorcycle: " + getModel());
    }
}

public class VehicleRentalExample {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("Toyota Corolla", 40),
            new Motorcycle("Honda Shine", 20)
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.describe();
            vehicle.rent(2);
            vehicle.returnVehicle();
        }
    }
}