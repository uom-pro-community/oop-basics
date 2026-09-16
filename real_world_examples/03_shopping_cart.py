class Product:
    def __init__(self, name, price):
        self.name = name
        self.price = price


class ShoppingCart:
    def __init__(self):
        self.products = []

    def add_product(self, product):
        self.products.append(product)
        print(f"Added: {product.name}")

    def calculate_total(self):
        return sum(product.price for product in self.products)

    def checkout(self):
        total = self.calculate_total()
        print(f"Total amount: ${total}")
        print("Order placed successfully.")


cart = ShoppingCart()
cart.add_product(Product("Keyboard", 40))
cart.add_product(Product("Mouse", 20))
cart.checkout()