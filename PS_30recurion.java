public class PS_30recurion {
    // Factorial (0)= 1
    // Factorial (n)= n*(n-1)*....1
    // Factorial(5)= 5*4*3*2*1=120
    // Factorial(n)= n*factorial(n-1)

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int factorial_iteretive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("The velute of factorial x is:" + factorial(x));
        System.out.println("The velute of factorial_iteretive x is:" + factorial_iteretive(x));
    }
}