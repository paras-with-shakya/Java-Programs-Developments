import java.util.Scanner;

public class PS_exe1 {
    public static void main(String[] args) {
        System.out.println("Enter Your All Subjects Marks: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Subject 1 Marks:");
        int sub1 = sc.nextInt();
        System.out.println("Enter Subject 2 Marks:");
        int sub2 = sc.nextInt();
        System.out.println("Enter Subject 3 Marks:");
        int sub3 = sc.nextInt();
        System.out.println("Enter Subject 4 Marks:");
        int sub4 = sc.nextInt();
        System.out.println("Enter Subject 5 Marks:");
        int sub5 = sc.nextInt();
        System.out.println("Enter Subject 6 Marks:");
        int sub6 = sc.nextInt();
        float percentegs = ((sub1 + sub2 + sub3 + sub4 + sub5 + sub6) / 600.0f) * 100;
        System.out.println("Your Percentage is: " + percentegs + "%");
        sc.close();
    }
}
