import java.util.Scanner;

public class PS_22_forloop {
    public static void main(String[] args) {
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(i);
        // }
        // Probleam 1
        // int n = 5;
        // for (int i = 0; i < n; i++) {
        // System.out.println(2 * i + 1);
        // }

        // for (int i = 5; i != 0; i--) {
        // System.out.println(i);
        // }
        // Problem 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        // System.out.println("Natural numbers from " + n + " to 1:");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
            // System.out.print(i);
        }
        sc.close();

    }
}
