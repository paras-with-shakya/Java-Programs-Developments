import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class PS_79_practiceSet15 {
    public static void main(String[] args) {
        // P1
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Paras 1");
        arr.add("Aranav 2");
        arr.add("Arun 3");
        arr.add("Aman 4");
        arr.add("Khushi 5");
        arr.add("Manik 6");
        arr.add("Shuarabh 7");
        arr.add("Prideep8");
        arr.add("Sachin 9");
        arr.add("Shubham 10");
        // arr.add(8,"Vivek 9");
        arr.set(8,"Vivek 9");
        for (Object o : arr) {
            System.out.println(o);
        }

        // P2
        Date d1 = new Date();
        // System.out.println(d1.getHours() + ":" +d1.getMinutes() + ":" +  d1.getSeconds());
        System.out.println(d1.getTime());
        // System.out.println(d1);

        // PS 3

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        //PS 4
        LocalDateTime dt = LocalDateTime.now();// This is the current date time
      
        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a E");// This is the date time format pattern
         String myDate = dt.format(df);
         System.out.println(myDate); 

        // PS 5
        HashSet<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(3);
        System.out.println(s1);

    }
}
