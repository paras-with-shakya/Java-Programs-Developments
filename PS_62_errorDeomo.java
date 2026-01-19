
import java.util.Scanner;


public class PS_62_errorDeomo {

    public static void main(String[] args) {
        // Syntext Error Demo
        //int a= 5 // Missing semicolon
        // c=2;//Not Decleretion of veriable c
        //System.out.println(a);

        //Logical Error Demo
        //Write a program to print prime numbers from 1 to 10
        System.out.println(2);
        for (int i = 1; i < 5; i++) {
            System.out.println(2 * i + 1);
        }

        // Runtime Error Demo
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        k = sc.nextInt();
        System.out.println("Interger part of 1000 Divided by k is "+ 1000/k);
        sc.close();
     }
}
