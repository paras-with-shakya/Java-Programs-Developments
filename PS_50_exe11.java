//problem 1 + 2
/*abstract class Pen {
    abstract void write();

    abstract void refill();
}

class FountainPen extends Pen {
    void write() {
        System.out.println("Writing...");
    }

    void refill() {
        System.out.println("Refill");
    }

    void ChangNiv() {
        System.out.println("Changing the Niv");
    }
}
    */
// Problem 3
class Monkey {
    void jump() {
        System.out.println("Monkey jumps");
    }

    void bite() {
        System.out.println("Monkey bites");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();

}

class Human extends Monkey implements BasicAnimal {
    // Human inherits jump and bite from Monkey

    void speak() {
        System.out.println("Hello sir!");
    }

    @Override
    public void eat() {
        System.out.println("Human eats");
    }

    @Override
    public void sleep() {
        System.out.println("Human sleeps");
    }

}

public class PS_50_exe11 {
    public static void main(String[] args) {
        // Problem 1 + 2
        // FountainPen fp = new FountainPen();
        // fp.write();
        // fp.refill();
        // fp.ChangNiv();

        // Problem 3
        Human hm = new Human();
        hm.jump();
        hm.bite();
        hm.eat();
        hm.speak();

    }
}
