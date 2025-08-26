public class PS_23_BreakAndCont {
    public static void main(String[] args) {

        // for (int i = 0; i <= 5; i++) {
        // System.out.println(i);
        // System.out.println("Java is Great");
        // if (i == 2) {
        // System.out.println("Breaking the loop:");
        // break; // This will exit the loop when i equals 2
        // }
        // }
        // System.out.println("Ending the loop:");

        // Using a while loop to demonstrate break statement
        // int i = 0;
        // while (i < 5) {
        // System.out.println(i);
        // System.out.println("Java is Great");
        // if (i == 2) {
        // System.out.println("Breaking the loop:");
        // break;
        // }
        // i++;
        // }
        // System.out.println("Ending the loop:");

        // Using a do-while loop to demonstrate break statement
        // int i = 0;
        // do {
        // System.out.println(i);
        // System.out.println("Java is Great");
        // if (i == 2) {
        // System.out.println("Breaking the loop:");
        // break;
        // }
        // i++;
        // } while (i < 5);
        // System.out.println("Ending the loop:");

        /* Using continue statement to skip the iteration when i equals 2 */
        // for (int i = 0; i < 5; i++) {
        // if (i == 2) {
        // System.out.println("Breaking the loop:");
        // continue;
        // }
        // System.out.println(i);
        // System.out.println("Java is Great"); // This will exit the loop when i equals
        // }

        int i = 0;
        do {
            i++;
            if (i == 2) {
                System.out.println("Continue the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is Great");
        } while (i < 5);
        System.out.println("Ending the loop:");
    }
}
