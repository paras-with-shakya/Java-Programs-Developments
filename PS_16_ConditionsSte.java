import java.util.Scanner;

public class PS_16_ConditionsSte {
    public static void main(String[] args) {
        System.out.println("Enter Inputs..");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        // int age = 18;
        // boolean cond = (age == 18);
        // if (cond)
        if (age >= 18) {
            System.out.println("You can drive");
        }
        // else if (age == 18) {
        // System.out.println("You can drive with a learner's license");
        // }

        else {
            System.out.println("You can not Drive");
        }
    }
}
