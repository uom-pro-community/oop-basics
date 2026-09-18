class DogForPolymorphism {
    public void speak() {
        System.out.println("Woof");
    }
}

class CatForPolymorphism {
    public void speak() {
        System.out.println("Meow");
    }
}

public class PolymorphismExample {
    public static void makeAnimalSpeak(Object animal) {
        if (animal instanceof DogForPolymorphism) {
            ((DogForPolymorphism) animal).speak();
        } else if (animal instanceof CatForPolymorphism) {
            ((CatForPolymorphism) animal).speak();
        }
    }

    public static void main(String[] args) {
        makeAnimalSpeak(new DogForPolymorphism());
        makeAnimalSpeak(new CatForPolymorphism());
    }
}