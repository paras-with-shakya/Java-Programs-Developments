class Base1 {
    public int x;

    Base1() {
        System.out.println("I am a constructor");
    }

    Base1(int a) {
        System.out.println("I am a overloaded constructor:" + a);
    }

}

class Drived1 extends Base1 {
    public int y;

    Drived1() {
        super(0);
        System.out.println("I am a derived class constructor");
    }

    Drived1(int a, int b) {
        super(a);
        System.out.println("I am a derived class overloded constructor:" + b);
    }

}

class ChildofDrived1 extends Drived1 {
    ChildofDrived1() {
        System.out.println("I am child of derived class constructor");
    }

    ChildofDrived1(int a, int b, int c) {
        super(a, b);
        System.out.println("I am child of derived class constructor:" + c);
    }
}

public class PS_37_constructorIninheritance {
    public static void main(String[] args) {
        // Base1 bs = new Base1();
        // Drived1 dv = new Drived1();
        // Drived1 dv1 = new Drived1(4, 5);
        ChildofDrived1 cd = new ChildofDrived1(2, 5, 8);

    }
}
