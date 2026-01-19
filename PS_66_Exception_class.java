
import java.util.Scanner;

class MyException extends Exception {

    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class MaxAgeException extends Exception {

    @Override
    public String toString() {
        return "Age cannot be greater than 125Y";
    }

    @Override
    public String getMessage() {
        return "Make sure that the value of age entered is Correct";
    }
}

public class PS_66_Exception_class {

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        if (a < 9) {
            try {
                // throw new MyException();
                // throw new ArithmeticException();
                throw new MaxAgeException();
            } 
            catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                // System.out.println(e);
                // e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("End of the Program");
        }
        sc.close();
    }
}
