package Test4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTest {

    public static void main(String[] args) {

        LocalDateTime greatDay = LocalDateTime.parse("2015-01-01T22:03:50");             // It will throw a DateTimeException because it doesnt have a time component.
        String greatDayStr = greatDay.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(greatDayStr);
    }
}
