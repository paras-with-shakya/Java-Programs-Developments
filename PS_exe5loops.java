// import java.util.Scanner;

public class PS_exe5loops {
    public static void main(String[] args) {
        // Problem 1
        // int n = 5;
        // for (int i = n; i > 0; i--) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");
        // }
        // System.out.print("\n");
        // }

        // Problem 2
        // int sum = 0;
        // int n = 4;
        // for (int i = 1; i < n; i++) {
        // sum = sum + (2 * i);
        // }
        // System.out.println("Sum of Even Number: ");
        // System.out.println(sum);

        // // Problem 3
        // int Sum = 0;
        // int m = 3;
        // int i = 1;
        // while (i < m) {
        // Sum = Sum + (2 * i);
        // i++;
        // }
        // System.out.println("Sum of Even Number: ");
        // System.out.println(sum);

        // Problem 4

        // int n = 5;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number to print its multiplication table: ");
        // int n = sc.nextInt();
        // System.out.println("Multiplication Table of " + n + ":");
        // // Using a for loop to print the multiplication table

        // for (int i = 1; i <= 10; i++)------> Gose from i=0 to i=9

        // for (int i = 1; i <= 10; i++) {
        // System.out.printf("%d X %d = %d\n", n, i, n * i);
        // }

        // Problem 5

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number to print its multiplication table: ");
        // int n = sc.nextInt();
        // System.out.println("Multiplication Table of " + n + ":");
        // // Using a for loop to print the multiplication table
        // for (int i = 10; i >= 1; i--) {
        // System.out.printf("%d X %d = %d\n", n, i, n * i);
        // }

        // Problem 6

        // int n = 5;
        // What is Factorial n! = n*n-1*n-2*...*1
        // 5! = 5*4*3*2*1 = 120
        // int i = 1;
        // int fact = 1;
        // while (i <= n) {
        // fact *= i;
        // i++;
        // }
        // System.out.println("Factorial of " + n + " is: " + fact);

        // Problem 7

        // int n = 5;
        // // int i = 1;
        // int fact = 1;
        // for (int i = 1; i <= n; i++) {
        // fact *= i;
        // }
        // System.out.println("Factorial of " + n + " is: " + fact);

        // Problem 8 -------> True

        // Problem 9

        int n = 8;
        int sum = 0;
        for (int i = 1; i <= 2; i++) {
            sum += n * i;
        }
        System.out.println(sum);

    }

}
