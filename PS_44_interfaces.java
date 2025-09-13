interface Bicycle {
    int a = 10;

    void applyBreake(int decrement);

    void aUp(int increment);
}

interface HornBicycle {
    void BlowHornk3g();

    void BlowHornMhu();

}

class AvonCycle implements Bicycle, HornBicycle {

    void BlowHorn() {
        System.out.println("Pee Pee Poo Poo");
    }

    public void applyBreake(int decrement) {
        // a = a - decrement;
        System.out.println("Applying Brakes");
    }

    public void aUp(int increment) {
        // a = a + increment;
        // a = a + increment;
        System.out.println("Applying A");
    }

    public void BlowHornk3g() {
        System.out.println("Kabhi khushi kabhi gam pee pee pee pee");
    }

    public void BlowHornMhu() {
        System.out.println("May hu Na poo poo poo");
    }
}

public class PS_44_interfaces {
    public static void main(String[] args) {
        AvonCycle cyclePs = new AvonCycle();
        cyclePs.applyBreake(1);
        // System.out.println("Cycle A: " + cyclePs.a);
        // cyclePs.aUp(4);
        // System.out.println("Cycle A: " + cyclePs.a);
        // You can create properties in Interface
        System.out.println(cyclePs.a);
        // You cannot modify properties in Interface as they are final
        // cyclePs.a = 455;
        // System.out.println(cyclePs.a);
        // cyclePs.BlowHorn();
        // System.out.println("Cycle A: " + cyclePs.a);

        cyclePs.BlowHornk3g();
        cyclePs.BlowHornMhu();

    }
}
