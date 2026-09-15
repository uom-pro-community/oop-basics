class Animal:
    def eat(self):
        print("This animal eats food.")


class Dog(Animal):
    def bark(self):
        print("The dog barks.")


dog = Dog()
dog.eat()
dog.bark()