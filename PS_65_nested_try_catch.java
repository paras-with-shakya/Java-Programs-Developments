
import java.util.Scanner;

public class PS_65_nested_try_catch {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0]=10;
        marks[1]=12;   
        marks[2]=16;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index: ");
        int ind = sc.nextInt();
        try {
            System.out.println("Welcome to My Program");
            try {
                System.out.println(marks[ind]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException occurred in inner try block");
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println("Some Exception occurred in outer try block");
            System.out.println(e);
        }
        System.out.println("End of the Program");
        sc.close();
    }
}
