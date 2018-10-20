package Test6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneTest {

//    public String getDataString(LocalDateTime ldt) {
//        return DateTimeFormatter.ISO_ZONED_DATE_TIME.format(ldt);
//    }
}

// The LocalDateTime class does not contain Zone information but ISO_ZONED_DATE_TIME requires it. So it will throw java.time.temporal.UnsupportedTemporalTypeException.
// UnsupportedTemporalTypeException extends DateTimeException.