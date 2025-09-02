import java.util.Scanner;

public class PS_19_exe4 {
    public static void main(String[] args) {
        // Problem 1
        // int a = 10;
        // if (a = 11) {
        // System.out.println("a is equal to 11");
        // } else {
        // System.out.println("a is not equal to 10 or 11");

        // }// oputput --> Errer Show

        // Problem 2
        // byte m1, m2, m3;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your marks in Physics");
        // m1 = sc.nextByte();
        // System.out.println("Enter your marks in Chemistry");
        // m2 = sc.nextByte();
        // System.out.println("Enter your marks in Mathematics");
        // m3 = sc.nextByte();
        // float avg = (m1 + m2 + m3) / 3.0f;
        // System.out.println("Your Overall Percentage marks is: " + avg);
        // if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
        // System.out.println("You are Pass!");
        // } else {
        // System.out.println("You are Fail! Please try again.");
        // }
        /*
         * Oputput Example
         * Enter your marks in Physics
         * 41
         * Enter your marks in Chemistry
         * 42
         * Enter your marks in Mathematics
         * 44
         * Your Overall Percentage marks is: 42.333332
         * You are Pass!
         */
        // Problem 3
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your income in Lakhs per annum:");
        // float tex = 0;
        // float income = sc.nextFloat();
        // if (income <= 2.5) {
        // tex = tex + 0;
        // } else if (income > 2.5f && income <= 5f) {
        // tex = tex + 0.05f * (income - 2.5f);
        // } else if (income > 5f && income <= 10.0f) {
        // tex = tex + 0.05f * (5.0f - 2.5f);
        // tex = tex + 0.2f * (income - 5.0f);
        // } else if (income > 10.0f) {
        // tex = tex + 0.05f * (5.0f - 2.5f);
        // tex = tex + 0.2f * (10.0f - 5.0f);
        // tex = tex + 0.3f * (income - 10.0f);
        // }
        // System.out.println("The total tax paid by the employee is: " + tex);
        // Problem 4
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your No.:");
        // int Days = sc.nextInt();
        // switch (Days) {
        // case 1 -> System.out.println("Monday");
        // case 2 -> System.out.println("Tuesday");
        // case 3 -> System.out.println("Wednesday");
        // case 4 -> System.out.println("Thursday");
        // case 5 -> System.out.println("Friday");
        // case 6 -> System.out.println("Saturday");
        // case 7 -> System.out.println("Sunday");
        // default -> System.out.println("Invalid day");
        // }
        // Problem 5
        // Create a Scanner object to read user input
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter a year: ");
        // int year = scanner.nextInt();

        // // A year is a leap year if it is divisible by 4, but not by 100,
        // // unless it is also divisible by 400.
        // if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        // System.out.println(year + " is a leap year.");
        // } else {
        // System.out.println(year + " is not a leap year.");
        // }

        // // Close the scanner to prevent resource leaks
        // scanner.close();
        // Problem 6
        Scanner sc = new Scanner(System.in);
        String Webside = sc.next();
        if (Webside.endsWith(".com")) {
            System.out.println("This is a Commercial Website");
        } else if (Webside.endsWith(".org")) {
            System.out.println("This is a OrganiZtional Website");
        } else if (Webside.endsWith(".in")) {
            System.out.println("This is a Indian Website");
        }
        sc.close();
    }
}
