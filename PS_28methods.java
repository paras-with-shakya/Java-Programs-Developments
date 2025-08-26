public class PS_28methods {

    static void foo() {
        System.out.println("Good Morning Bro!: ");
    }

    static void foo(int a) {
        System.out.println("Good Morning " + a + " Bro! ");
    }

    static void foo(int a, int b) {
        System.out.println("Good Morning " + a + " Bro! ");
        System.out.println("Good Morning " + b + " Bro! ");
    }
    // static void change1(int a1) {
    // a1 = 98;
    // }

    // static void change2(int[] arr) {
    // arr[0] = 98;
    // }

    // static void telljok() {
    // System.out.println("Some people pick their nose, but I was born with mine.");
    // }

    public static void main(String[] args) {
        // telljok();

        // Case 1: Changing the Integer
        // int x = 45;
        // change(x);
        // System.out.println("The value of x is changed to: " + x);

        // Case 1: Changing the Array
        // int[] marks = { 57, 67, 76, 98, 99 };
        // change2(marks);
        // System.out.println("The value of Array is changed to: " + marks[0]);

        // MEthod Overloading
        foo();
        foo(3000);
        foo(3000, 4000); // Argument are actual!

    }

}
