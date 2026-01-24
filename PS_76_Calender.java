import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class PS_76_Calender {
    public static void main(String[] args) {
        // Calendar c1 = Calendar.getInstance();
        // System.out.println(c1.getCalendarType());
        // System.out.println(c1.getTimeZone());
        // System.out.println(c1.getWeekYear());

        // Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        Calendar c1 = Calendar.getInstance();

        // System.out.println(c1.getCalendarType());
        // System.out.println(c1.getTimeZone().getID());
        // System.out.println(c1.getWeekYear());
        System.out.println(c1.get(Calendar.DATE));
        System.out.println(c1.get(Calendar.SECOND));
        System.out.println(c1.get(Calendar.MONTH));
        System.out.println(c1.get(Calendar.YEAR));
        System.out.println(c1.get(Calendar.HOUR));
        System.out.println(c1.get(Calendar.HOUR_OF_DAY)+ ":" + c1.get(Calendar.MINUTE)+ ":" + c1.get(Calendar.SECOND));
        
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println("This Year is:" + cal.isLeapYear(2028));
        for(int i=0; i<=5; i++){
             System.out.println(TimeZone.getAvailableIDs()[i]);
        }

    }
}
