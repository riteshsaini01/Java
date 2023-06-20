import java.util.*;
import java.time.*;
import java.time.temporal.*;

public class Local_Date_Time 
{
    public static void main(String args[])
    {
        ZonedDateTime zdt=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zdt);

        MonthDay md=MonthDay.now();
        md.getMonth();

        Period p=Period.of(2,2,10);
        System.out.println(p.addTo(LocalDate.now()));

        Instant i=Instant.now();
        System.out.println(i);

        // OffsetDateTime odt=OffsetDateTime.now();
        // System.out.println(odt);

    }
    
}
