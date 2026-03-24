package chap4.WorkingWithDatesAndTime;

import java.time.*;

public class Page219 {
    public static void main(String[] args) {
//        Working with Instants
//        The Instant class represents a specific moment in time in the GMT time zone.
//        Suppose that you want to run a timer.
        var now = Instant.now();
// Do something time consuming
        var later = Instant.now();

        var duration = Duration.between(now, later);
        System.out.println(duration.toMillis());  // Returns number milliseconds

//        In our case, the “something time consuming” was just over a second,
//        and the program printed out 1025.
//        If you have a ZonedDateTime, you can turn it into an Instant:
        var date = LocalDate.of(2025, 5, 25);
        var time = LocalTime.of(11, 55, 00);
        var zone = ZoneId.of("US/Eastern");
        var zonedDateTime = ZonedDateTime.of(date, time, zone);

        var instant = zonedDateTime.toInstant(); // 2025–05–25T15:55:00Z
        System.out.println(zonedDateTime); // 2025–05–25T11:55–04:00[US/Eastern]
        System.out.println(instant);       // 2025–05–25T15:55:00Z
//
//        The last two lines represent the same moment in time. The ZonedDateTime includes a time zone.
//        The Instant gets rid of the time zone and turns it into an Instant of time in GMT.
//        You cannot convert a LocalDateTime to an Instant.
//        Remember that an Instant is a point in time.
//        A LocalDateTime does not contain a time zone, and it is therefore not universally
//        recognized around the world as the same moment in time.

    }
}
