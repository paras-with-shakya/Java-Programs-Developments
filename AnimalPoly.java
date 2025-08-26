class AnimalDemo {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog class overrides the makeSound() method
class Dog extends AnimalDemo {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Cat class also overrides makeSound()
class Cat extends AnimalDemo {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class to test runtime polymorphism

public class AnimalPoly {
    public static void main(String[] args) {
        AnimalDemo myAnimal; // Parent class reference

        myAnimal = new Dog();
        myAnimal.makeSound(); // Output: Dog barks

        myAnimal = new Cat();
        myAnimal.makeSound(); // Output: Cat meows
    }
}
