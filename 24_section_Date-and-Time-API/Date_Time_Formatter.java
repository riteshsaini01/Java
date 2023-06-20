import java.util.*;
import java.time.*;
import java.time.temporal.*;
import java.time.format.*;

public class Date_Time_Formatter {
    public static void main(String args[])
    {
        // ZonedDateTime dt=ZonedDateTime.now();
        // DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z Z");

        LocalDateTime dt=LocalDateTime.now();

        System.out.println(dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println(dt.get(ChronoField.AMPM_OF_DAY));

    }
    
}
