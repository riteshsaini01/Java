import java.util.*;

public class Date2 {
    public static void main(String args[])
    {
        GregorianCalendar gc=new GregorianCalendar();

        gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        TimeZone tz=gc.getTimeZone();
        System.out.println(tz.getID());

       // System.out.println(gc.getTimeZone());
        
       // System.out.println(gc.get(Calendar.DATE));
       // System.out.println(gc.get(Calendar.MONTH));
       // System.out.println(gc.get(Calendar.DAY_OF_YEAR));
    }

    
}
