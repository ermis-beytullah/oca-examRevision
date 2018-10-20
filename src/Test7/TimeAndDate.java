package Test7;

import java.time.*;

public class TimeAndDate {

    public static void main(String[] args) {

        LocalDateTime ld = LocalDateTime.of(2015, Month.OCTOBER, 31, 10, 0);

        ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Duration.ofDays(1));
        System.out.println(date);

        date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Period.ofDays(1));
        System.out.println(date);
    }
}

// Here it is important to remember that Period is used to manipulate dates in terms of days, months and years.
// While Duration is used to manipulate dates in terms of hours, minutes and seconds.
// Therefore, Period doesn't mess with the time component of the date while Duration may change the time component if the date is close to the DST boundary.
