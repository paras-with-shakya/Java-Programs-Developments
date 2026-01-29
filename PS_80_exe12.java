 /*
         * You have to create a custum calculator with following operations:
         * 1. +->Addition
         * 2. - -> Subtraction
         * 3. * -> Multiplication
         * 4. / -> Division
         * which throws the following exceptions:
         * 1. Invalid input exception ex. 8 & 9:
         * 2. Cannot divide by 0 exception
         * 3. Max input exception if any of the inputs is greater than 100000
         * 4. Max multiplier reached exception don't allow any multiplication if the
         * user wants to multiply a number
         * greater than 7000 with any other number
         */



import java.util.Scanner;

class InvalidInputException extends Exception {

    @Override
    public String toString() {
        return "Cannot add 8 and 9";
    }

    @Override
    public String getMessage() {
        return "Please Provide valid Input";
    }
}

class CannotDivideByZeroException extends Exception {

    @Override
    public String toString() {
        return "Cannot divide by zero";
    }

    @Override
    public String getMessage() {
        return "Denominator cannot be zero";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "Input cannot be greater than 100000";
    }
    @Override
    public String getMessage(){
        return "Please provide valid input less than 100000";
    }
}
class MultiplyInputException extends Exception{
     @Override
    public String toString(){
        return "Input for multiplication cannot be geater than 70000";
    }
    @Override
    public String getMessage(){
        return "Please Provide valid input less than 70000 for multiplication";
    }
}

class CostumCalculator {
    double add(double a, double b) throws InvalidInputException, MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        if (a == 8 || b == 9) {
            throw new InvalidInputException();
        }
        return a + b;
    }

    double Subtraction(double a, double b) throws MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        return a - b;
    }

    double Multiplication(double a, double b)throws MaxInputException , MultiplyInputException{
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        else if(a > 70000 || b > 70000){
            throw new MultiplyInputException();
        }
        return a * b;
    }

    double Divide(double a, double b) throws CannotDivideByZeroException , MaxInputException{
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        if (b==0) {
           throw new CannotDivideByZeroException(); 
        }
         return a/b;
    }
}

public class PS_80_exe12 {
    public static void main(String[] args) throws InvalidInputException , CannotDivideByZeroException ,
     MaxInputException , MultiplyInputException {
        CostumCalculator cal = new CostumCalculator();
        // cal.add(8, 9);
        // cal.Divide(6, 0);
        // cal.Multiplication(80000, 5);
        // cal.Divide(6000000, 40);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to Multiplication: ");
        double a = sc.nextInt();
        double b = sc.nextInt();
        System.out.println(cal.Multiplication(a, b));
        sc.close();
    //    System.out.println(cal.Subtraction(1000000 , 20));

    }
}
