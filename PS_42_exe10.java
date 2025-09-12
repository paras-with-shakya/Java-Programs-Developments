
class Circale {
    public int radius;

    Circale() {
        System.out.println("I am not a parameterized constructor");
    }

    Circale(int r) {
        System.out.println("I am a parameterized constructor");
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class CylinderOne extends Circale {
    public int height;

    CylinderOne(int r, int h) {
        // super(r);
        System.out.println("I am a cylinder constructor");
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class PS_42_exe10 {
    public static void main(String[] args) {
        // Problem 1
        // Circale c = new Circale(12);
        CylinderOne cy = new CylinderOne(4, 5);
    }
}
