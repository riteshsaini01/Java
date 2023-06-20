import java.util.*;
import java.time.*;
import java.time.temporal.*;

public class Time1
{
    public static void main(String args[])
    {
        

        LocalTime t=LocalTime.now(Clock.systemDefaultZone());

        t.plusHours(6);
        t.minusHours(3);

    
        System.out.println(t);
    }

    
}
