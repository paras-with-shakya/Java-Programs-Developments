
public class PS_63_TryAndCatch {

    public static void main(String[] args) {
        // int a =4;
        // int b =2;
        int a = 4;
        int b = 0;
        //without try and catch
        // int c =a/b;
        // System.out.println("The result is: " + c);
        //with try and catch
        try {
            int c = a / b;
            System.out.println("The result is: " + c);
        } catch (Exception e) {
            System.out.println("We failed to Divice. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
