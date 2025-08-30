class Employee2 {

    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class CellPhone {
    public void ring() {
        System.out.println("Ringing...");
    }

    public void vibrat() {
        System.out.println("Vibrating...");
    }

    public void CollFriends() {
        System.out.println("Calling Aman Prajapti...");
    }

}

class Square {
    int side;

    public int area() {// formull is A = a2/ side*side
        return side * side;
    }

    public int perimeter() {// formula is 4*side(a)
        return 4 * side;
    }

}

class Rectangle {
    int length;
    int width;

    public int area() {// formula is l*w
        return length * width;
    }

    public int perimeter() {// formula is 2*(l+w)
        return 2 * (length + width);
    }

}

class Tommy {
    public void hit() {
        System.out.println("Hotting the Enemy...");
    }

    public void run() {
        System.out.println("Running form the Enemy...");
    }

    public void fire() {
        System.out.println("Friring on the Enemy...");
    }
}

class Circle {
    int radius;

    public double area() {// formula is 3.14*r*r
        return Math.PI * radius * radius;
    }

    public double perimeter() {// formula is 2*3.14*r
        return 2 * Math.PI * radius;
    }
}

public class PS_33_exe8 {
    public static void main(String[] args) {
        /*
         * // Problem 1
         * Employee2 ps = new Employee2();
         * ps.salary = 233;
         * System.out.println(ps.getSalary());
         * ps.setName("AranavShakya");
         * System.out.println(ps.getName());
         * 
         * // Problem 2
         * CellPhone as = new CellPhone();
         * as.CollFriends();
         * as.vibrat();
         * as.ring();
         */

        /*
         * // Problem 3
         * Square sq = new Square();
         * sq.side = 3;
         * System.out.println(sq.area());
         * System.out.println(sq.perimeter());
         * 
         * // Problem 4
         * 
         * Rectangle re = new Rectangle();
         * re.length = 4;
         * re.width = 5;
         * System.out.println(re.area());
         * System.out.println(re.perimeter());
         */

        // Problem 5
        Tommy tom = new Tommy();
        tom.fire();
        tom.hit();
        tom.run();

        // Program 6

        Circle cir = new Circle();
        cir.radius = 7;
        System.out.println("The area of circle is :.....");
        System.out.println(cir.area());

    }
}
