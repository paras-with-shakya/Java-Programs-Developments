
abstract class Parent1 {
    public Parent1() {
        System.out.println("I an a base class constructor");
    }

    public void seyHello() {
        System.out.println("Hello");
    }

    abstract public void greet();

    abstract public void greet1();
}

class Child2 extends Parent1 {
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet1() {
        System.out.println("Good Evening");
    }
}

abstract class Child3 extends Parent1 {
    @Override
    public void greet() {
        System.out.println("Good Afternoon");
    }
}

public class PS_43_abstractmeth {
    public static void main(String[] args) {
        // Parent1 p =new Parent1();-->error showing
        Child2 c = new Child2();
        c.greet();
        // Child3 c1 =new Child2();-->error showing

    }
}
