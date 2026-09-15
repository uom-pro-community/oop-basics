class Dog:
    def speak(self):
        print("Woof")


class Cat:
    def speak(self):
        print("Meow")


def make_animal_speak(animal):
    animal.speak()


make_animal_speak(Dog())
make_animal_speak(Cat())