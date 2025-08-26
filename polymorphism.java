class MathOperations {
    // Method with two int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with double parameters
    double add(double a, double b) {
        return a + b;
    }
}

// Main class
public class polymorphism {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println(math.add(5, 10)); // Output: 15
        System.out.println(math.add(5, 10, 15)); // Output: 30
        System.out.println(math.add(5.5, 2.3)); // Output: 7.8
    }
}
