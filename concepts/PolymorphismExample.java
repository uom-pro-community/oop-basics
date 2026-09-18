interface AnimalForPolymorphism {
    void speak();
}

class DogForPolymorphism implements AnimalForPolymorphism {
    @Override
    public void speak() {
        System.out.println("Woof");
    }
}

class CatForPolymorphism implements AnimalForPolymorphism {
    @Override
    public void speak() {
        System.out.println("Meow");
    }
}

public class PolymorphismExample {
    public static void makeAnimalSpeak(AnimalForPolymorphism animal) {
        animal.speak();
    }

    public static void main(String[] args) {
        makeAnimalSpeak(new DogForPolymorphism());
        makeAnimalSpeak(new CatForPolymorphism());
    }
}