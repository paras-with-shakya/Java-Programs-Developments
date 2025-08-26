public class PS_31exe7 {

    // Problem 1
    // static void multiplication(int n) {
    // for (int i = 1; i <= 10; i++) {
    // System.out.format("%d X %d = %d\n", n, i, n * i);
    // }
    // }

    // // Problem 2
    // static void printStar1(int n) {
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < i + 1; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // Problem 3
    // Sum(n)= 1+2+3+....n
    // Sum(n)= 1+2+3+....+n-1+1
    // Sum(n)= sum(n-1)+n
    // Sum(3)= 3+Sum(2)
    // Sum(3)= 3+2+Sum(1)
    // Sum(3)= 3+2+1
    // static int sumNatural(int n) {
    // // Base Condition
    // if (n == 1) {
    // return 1;
    // }
    // return n + sumNatural(n - 1);
    // }

    // Problem 4

    // static void printStar2(int n) {
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n - i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // Problem 5

    // fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    // static int fib(int n) {
    // if (n == 0) { // Index find in code
    // return 0;
    // }
    // if (n == 1) {
    // return 1;
    // } else {
    // return fib(n - 1) + fib(n - 2);

    // }
    // Index not find in code
    // if (n == 1) { // Code Logic 1
    // return 0;
    // }
    // if (n == 2) {
    // return 1;
    // }
    // if (n == 1 || n == 2) // Code Logic
    // return n - 1;
    // else {
    // return fib(n - 1) + fib(n - 2);

    // }
    // }

    // Iteretive models
    // static int fibIterative(int n) {
    // if (n == 1 || n == 2)
    // return n - 1;
    // int a = 0, b = 1, c = 0;
    // for (int i = 3; i <= n; i++) {
    // c = a + b;
    // a = b;
    // b = c;
    // }
    // return c;
    // }

    public static void main(String[] args) {

        // int []= arr{23,34,45,56,78};
        // System.out.println(arr.lenth);
        int a = 2;
        for (int i = 1; i <= 100; i++) {
            System.out.println(a * i);

        }
        // multiplication(7);
        // printStar1(4);
        // int c = sumNatural(4);
        // System.out.println(c);
        // printStar2(4);
        // int result = fibIterative(8);
        // System.out.println(result);

    }
}
