import java.util.Scanner;

public class PS_18_Else_If_SwitchCase {

    public static void main(String[] args) {

        System.out.println("Enter Inputs...");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("You are Audult!");
                break;
            case 23:
                System.out.println("You are going to join a Job!");
                break;
            case 60:
                System.out.println("You are going to Reatied!");
                break;
            default:
                System.out.println("Enjoy Your Life!");
        }
        System.out.println("Thanks For Java Codes!");

        /*
         * System.out.println("Enter Inputs...");
         * Scanner sc = new Scanner(System.in);
         * int age = sc.nextInt();
         * if (age > 56) {
         * System.out.println("You are exprienceed!");
         * } else if (age > 46) {
         * System.out.println("You are semi-exprienceed!");
         * } else if (age > 34) {
         * System.out.println("You are semi-semi-exprienceed!");
         * } else {
         * System.out.println("You are Not exprienceed!");
         * }
         */

    }
}