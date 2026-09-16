class Vehicle:
    def __init__(self, model, daily_rate):
        self.model = model
        self.daily_rate = daily_rate
        self.is_available = True

    def rent(self, days):
        if not self.is_available:
            print(f"{self.model} is already rented.")
            return
        self.is_available = False
        print(f"{self.model} rented for {days} days: ${self.daily_rate * days}")

    def return_vehicle(self):
        self.is_available = True
        print(f"{self.model} returned successfully.")


class Car(Vehicle):
    def describe(self):
        print(f"Car: {self.model}")


class Motorcycle(Vehicle):
    def describe(self):
        print(f"Motorcycle: {self.model}")


vehicles = [Car("Toyota Corolla", 40), Motorcycle("Honda Shine", 20)]

for vehicle in vehicles:
    vehicle.describe()
    vehicle.rent(2)
    vehicle.return_vehicle()