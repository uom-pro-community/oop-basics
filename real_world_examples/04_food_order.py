class MenuItem:
    def __init__(self, name, price):
        self.name = name
        self.price = price


class Restaurant:
    def __init__(self, name):
        self.name = name
        self.menu = []

    def add_item(self, item):
        self.menu.append(item)

    def show_menu(self):
        for item in self.menu:
            print(f"{item.name}: ${item.price}")


class FoodOrder:
    def __init__(self, customer, restaurant):
        self.customer = customer
        self.restaurant = restaurant
        self.items = []

    def add_item(self, item_name):
        for item in self.restaurant.menu:
            if item.name == item_name:
                self.items.append(item)
                print(f"Added {item.name} to the order.")
                return
        print("Item not found on the menu.")

    def total(self):
        return sum(item.price for item in self.items)

    def place_order(self):
        print(f"{self.customer}'s order total: ${self.total()}")
        print("Order placed successfully.")


restaurant = Restaurant("Python Cafe")
restaurant.add_item(MenuItem("Pizza", 12))
restaurant.add_item(MenuItem("Juice", 4))

order = FoodOrder("Alex", restaurant)
order.add_item("Pizza")
order.add_item("Juice")
order.place_order()