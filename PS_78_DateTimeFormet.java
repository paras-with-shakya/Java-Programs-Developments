
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PS_78_DateTimeFormet {
    public static void main(String[] args){
        LocalDateTime dt = LocalDateTime.now();// This is the current date time
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a E || DD-MM-YYYY");// This is the date time format pattern
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;// This is the ISO date time format pattern

        String myDate = dt.format(df); // Creatting A Formatteer Date String
        System.out.println(myDate);

        String youDate = dt.format(df2); // Creatting A Formatteer Date String
        System.out.println(youDate);
    }
}
