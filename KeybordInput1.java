import java.util.Scanner;

public class KeybordInput1 {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.1");
        int a = sc.nextInt();
        System.out.println("Enter No. 2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of all no. is");
        System.out.println(sum);
        // boolean b1 = sc.hasNextInt();// Expretion Ki validity check
        // System.out.println(b1);
        // String str = sc.nextLine();
        // System.out.println(str);
    }

}
