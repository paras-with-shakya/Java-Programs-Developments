public class PS_25_Array {
    public static void main(String[] args) {
        // float[] marks = { 98.5f, 85.0f, 76.5f, 88.0f, 92.5f };
        // System.out.println(marks.length);
        // System.out.println(marks[2]);

        // String[] student = { "Paras", "Aman", "Arun", "Khushilal", "Manik" };
        // System.out.println(student.length);
        // System.out.println(student[0]);

        int[] marks = { 98, 85, 76, 88, 92 };
        // System.out.println(marks.length);

        // Display the Array (Naive way)
        // System.out.println("Printing using Niave way");
        // System.out.println("Marks at index 0: " + marks[0]);
        // System.out.println("Marks at index 1: " + marks[1]);
        // System.out.println("Marks at index 2: " + marks[2]);
        // System.out.println("Marks at index 3: " + marks[3]);
        // System.out.println("Marks at index 4: " + marks[4]);

        // Display the Array (Using for loop)=====> All marks Printing the loops
        System.out.println("Printing using for loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // Quik Quize = Display the Array (Using revers for loop)
        System.out.println("Printing using reverse for loop");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }

        // Display the Array (Using for-each loop)====> One by One Printing the Only
        // elements And not printing length for-each loop
        System.out.println("Printing using for-each loop");
        for (int element : marks) {
            System.out.println(element);
        }

    }
}
