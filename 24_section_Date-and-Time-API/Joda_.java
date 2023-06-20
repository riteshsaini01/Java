import java.util.*;
import java.time.*;
import java.time.temporal.*;

public class Joda_ 
{
    public static void main(String args[])
    {
        // Date d=new Date();
        // setTime(21);
        // System.out.println(d);

        LocalDate dt=LocalDate.now(Clock.systemDefaultZone());
        // LocalDate dt=LocalDate.ofEpochDay(1); 

        dt.plusMonths(6);
        dt.minusMonths(3);

        // LocalDate dt=LocalDate.of(2020,Month.March,10);
        System.out.println(dt);
    }

    
}
