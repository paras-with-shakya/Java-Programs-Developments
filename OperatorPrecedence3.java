public class OperatorPrecedence3 {
    public static void main(String[] args) {
        // Quick Quiz in java
        // int a = 64 * 4 - 30 / 3;
        // int b = 60 / 5 - 30 * 2;
        // System.out.println(a);
        // System.out.println(b);
        // Precedence & associativity
        /*
         * int x = 6;
         * int y = 1;
         * int k = x * y / 2;
         * System.out.println(k);
         */
        int a = 1;
        int b = 4;
        int c = 5;
        int k = (b * b - 4 * a * c) / (2 * a);
        System.out.println(k);

        /*
         * int v = 4;
         * int u = 8;
         * int k = v * v - u * u;
         * System.out.println(k);
         */
        // int a = 4;
        // int b = 6;
        // int d = 4;
        // int k = a * b - d;
        // System.out.println(k);
    }
}
