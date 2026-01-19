
import java.util.Scanner;

public class PS_64 {

    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 10;
        marks[1] = 12;
        marks[2] = 16;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index: ");
        int index = sc.nextInt();

        System.out.println("Enter the Number of you want to Divide the value with");
        int number = sc.nextInt();
        try {
            System.out.println("The value at array index entered is: " + marks[index]);
            System.out.println("The value of array value divided by number is: " + marks[index] / number);
        }
         catch (ArithmeticException e) {
            System.out.println("ArithmeticException not allowed!");
            System.out.println(e);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException not allowed!");
            System.out.println(e);
        }
         catch (Exception e) {
            System.out.println("Some Exceptionis not allowed!");
            System.out.println(e);
        }
        sc.close();
    }
}
