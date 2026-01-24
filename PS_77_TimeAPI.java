
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.Temporal;

public class PS_77_TimeAPI {
    public static void main(String[] args) {
        final LocalDate EPOCH = LocalDate.of(1970, 1, 1);
        System.out.println(EPOCH);

        Temporal t = EPOCH.adjustInto(LocalDateTime.now());
        System.out.println(t);


        LocalDate d1 = LocalDate.now();
        System.out.println(d1);

        LocalTime t1 = LocalTime.now();
        System.out.println(t1);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}
