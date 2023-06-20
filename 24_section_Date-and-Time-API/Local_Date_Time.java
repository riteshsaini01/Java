import java.util.*;
import java.time.*;
import java.time.temporal.*;

public class Local_Date_Time 
{
    public static void main(String args[])
    {
        ZonedDateTime zdt=ZonedDateTime.now(ZoneId.of("America/Los_Angelas"));
        System.out.println(zdt);

        MonthDay md=MonthDay.now();
        md.getMonth();

        // OffsetDateTime odt=OffsetDateTime.now();
        // System.out.println(odt);

    }
    
}
