import java.util.Scanner;

public class PS_69_PracticeSet14 {
    public static void main(String[] args) {
        // Problem 1
        // Syntext Error
        // int a=5
        // logical Error
        // int age =50;
        // int year_born = 2000-50;

        // Runtime Error
        // System.out.println(6/0);

        // Problem 2
        try {
            int a = 666 / 0;
        } catch (IllegalArgumentException e) {
            System.out.println("HeHe");
        } catch (ArithmeticException e) {
            System.out.println("Haha");
        }

        // Problem 3
        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 99;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (flag && i < 5) {
            try {
                System.out.println("Enter the index of the va: ");
                index = sc.nextInt();
                System.out.println("The value of marks is : " + marks[index]);
                break;
            } 
            catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
        }
        if (i >= 5) {
            System.out.println("Error");
        }
    }
}