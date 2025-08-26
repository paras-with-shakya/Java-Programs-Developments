public class PS_29verargs {
    // Case 1: Variable Arguments (Varargs)
    // static int sum(int a, int b) {
    // return a + b;
    // }

    // static int sum(int a, int b, int c) {
    // return a + b + c;
    // }

    // static int sum(int a, int b, int c, int d) {
    // return a + b + c + d;
    // }

    // Case 2:
    public static int sum(int x, int... arr) {
        // Available as int[] arr

        int result = x;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Verargs Tutorial:");
        System.out.println("The Sum of Allready is: " + sum(8));
        System.out.println("The Sum of 1 is: " + sum(1));
        System.out.println("The Sum of 4 , 3 , 5 is: " + sum(4, 3, 5));
        System.out.println("The Sum of 4 , 3 , 7 , 5 is: " + sum(4, 7, 3, 5));
        System.out.println("The Sum of 4 , 1 , 3 , 5 , 6 is: " + sum(4, 1, 3, 5, 6));
    }
}
