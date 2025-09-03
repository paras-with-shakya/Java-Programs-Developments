// Parent class
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating...");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking...");
    }
}

// Main class to test inheritance
public class PS_36_inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.eat(); // Inherited from Animal
        dog.bark(); // Defined in Dog
    }
}
