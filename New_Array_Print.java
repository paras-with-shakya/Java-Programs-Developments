public class New_Array_Print {
    public static void main(String[] args) {
        int[] marks = { 98, 45, 67, 98, 90 };
        // float[] marks = { 99.9f, 89.88f, 56.6f, 78.4f, 34.5f };
        // System.out.println(marks.length);
        // System.out.println(marks[3]);
        // String[] Students = { "Chhavi", "Rohan", "Shub", "Raj" };
        // System.out.println(Students.length);
        // System.out.println(Students[3]);

        // Displaying the Array (Naive way)
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);

        // Displaying the Array (for loop)
        System.out.println("Printing using for loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        // Displaying the Array in Reverse order (for loop)
        System.out.println("Printing using the loop in reverse order");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }
        // Displaying the Array (for -each loop)
        System.out.println("Printing using for-each loop ");
        for (int element : marks) {
            System.out.println(element);
        }
    }

}
