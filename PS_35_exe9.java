// import java.util.Scanner;

class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;

    }

    public Cylinder(int radius) {
        this.radius = radius;
    }

    public int getRadus() {
        return radius;
    }

    public void setRadus(int radius) {
        this.radius = radius;
    }

    public int getheight() {
        return height;

    }

    public void setheight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double velume() {
        return Math.PI * radius * radius * height;
    }
}

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    // public void setLength(int length) {
    // this.length = length;
    // }

    public int getBreadth() {
        return breadth;
    }

    // public void setBreadth(int breadth) {
    // this.breadth = breadth;
    // }
}

public class PS_35_exe9 {
    public static void main(String[] args) {

        /*
         * //Prolem 1
         * Cylinder myCylinder = new Cylinder();
         * myCylinder.setRadus(9);
         * System.out.println(myCylinder.getRadus());
         * myCylinder.setheight(12);
         * System.out.println(myCylinder.getheight());
         */

        // Prolem 2

        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * Cylinder myCylinder = new Cylinder(12, 9);
         * System.out.print("Enter the radius of Cylinder: ");
         * int radius = sc.nextInt();
         * myCylinder.setRadus(radius);
         * 
         * System.out.print("Enter the height of Cylinder: ");
         * int height = sc.nextInt();
         * myCylinder.setheight(height);
         * 
         * System.out.println();
         * 
         * System.out.println("Cylinder Details:");
         * 
         * System.out.println("Radius:" + myCylinder.getRadus());
         * System.out.println("Height:" + myCylinder.getheight());
         * System.out.println("Area:" + myCylinder.surfaceArea());
         * System.out.println("Value:" + myCylinder.velume());
         * sc.close();
         */

        /*
         * // Prolem 3
         * Cylinder myCylinder = new Cylinder(9, 12);
         * // myCylinder.setRadus(9);
         * System.out.println(myCylinder.getRadus());
         * // myCylinder.setheight(12);
         * System.out.println(myCylinder.getheight());
         * System.out.println(myCylinder.surfaceArea());
         * System.out.println(myCylinder.velume());
         */

        // Prolem 4

        Rectangle myRectangle = new Rectangle(12, 9);
        System.out.println(myRectangle.getLength());
        System.out.println(myRectangle.getBreadth());

    }
}
