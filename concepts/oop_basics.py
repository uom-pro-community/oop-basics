from abc import ABC, abstractmethod


class BankAccount:
    """A basic class with encapsulated account balance."""

    def __init__(self, owner, balance=0):
        self.owner = owner
        self.__balance = balance

    def deposit(self, amount):
        if amount <= 0:
            raise ValueError("Deposit must be greater than zero")
        self.__balance += amount

    def get_balance(self):
        return self.__balance


class Animal(ABC):
    """An abstract base class."""

    @abstractmethod
    def speak(self):
        pass


class Dog(Animal):
    def speak(self):
        return "Woof"


class Cat(Animal):
    def speak(self):
        return "Meow"


def print_animal_sound(animal):
    """Polymorphism: works with any Animal subclass."""
    print(animal.speak())


def main():
    # Object creation and constructor
    account = BankAccount("Alex", 100)
    account.deposit(50)
    print(f"{account.owner}'s balance: ${account.get_balance()}")

    # Inheritance and polymorphism
    print_animal_sound(Dog())
    print_animal_sound(Cat())


if __name__ == "__main__":
    main()