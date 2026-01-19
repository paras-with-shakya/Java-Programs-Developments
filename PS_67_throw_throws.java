class NegetiveRadiusException extends Exception {

    @Override
    public String toString() {
        return "Radius cannot be negetive";
    }

    @Override
    public String getMessage() {
        return "Radius of circle should be positive";
    }
}

public class PS_67_throw_throws {
    public static double area(int r) throws NegetiveRadiusException {
        if (r < 0) {
            throw new NegetiveRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        // made By paras
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        // Aranav Uses divied function creatted by paras
        try {
            // int c = divide(6,0);
            // System.out.println(c);
            double ar = area(-5);
            System.out.println(ar);
        }
         catch (Exception e) {
            System.out.println("Exception occurred");
        }
        System.out.println("End of the main function");

    }
}
