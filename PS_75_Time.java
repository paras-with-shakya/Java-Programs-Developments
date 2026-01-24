import java.util.Date;

public class PS_75_Time {
    public static void main(String[] args) {
        Date D1 = new Date();
        System.out.println(D1);
        System.out.println("Current Date and Time: " + D1.toString());
        // System.out.println(D1.getSeconds());
        System.out.println(D1.getTime());
        // System.out.println(D1.getYear());

        // System.out.println("Milliseconds since January 1, 1970: " + D1.getTime());
        // System.out.println("Date and Time:" + D1.toString() + D1.getTime());

    }
}
